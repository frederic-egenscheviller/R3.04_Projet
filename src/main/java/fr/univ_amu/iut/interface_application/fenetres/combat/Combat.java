package fr.univ_amu.iut.interface_application.fenetres.combat;

import fr.univ_amu.iut.backend.entites.Entite;
import fr.univ_amu.iut.backend.joueur.Joueur;
import fr.univ_amu.iut.backend.magasin.Magasin;
import fr.univ_amu.iut.backend.partie.Partie;
import fr.univ_amu.iut.interface_application.fenetres.fenetre_fin.FinPartie;
import fr.univ_amu.iut.interface_application.fenetres.magasin.BoutonChampion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public abstract class Combat extends BorderPane {
    public Joueur joueur;
    private HBox conteneurDesBoutonsChampion = new HBox();

    private HBox conteneurCombattant = new HBox();
    private ArrayList<BoutonChampion> boutonsChampions = new ArrayList<>(5);
    private BoutonChampion boutonChampionChoisiAuCombat = new BoutonChampion();
    private Button combat = new Button("Se battre ! ");
    public Combat(Joueur joueur){
        super();
        this.joueur = joueur;
        this.setId("arrierePlanCombat");
        initId();
        initBoutonCombat();
        initBoutonsChampions();
        super.setBottom(conteneurDesBoutonsChampion);

        //Si plus de vie faire disparraitre de l'ecran
    }
    private void initId(){
        conteneurDesBoutonsChampion.setId("conteneurChampions");
        conteneurCombattant.setId("conteneurCombattant");
        combat.setId("boutonSeBattre");
    }
    private void initBoutonCombat(){
        combat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                combat();
                Combat.super.setLeft(null);
            }
        });
    }

    private void initBoutonsChampions() {
        for (int i = 0; i < joueur.getPaquet().size(); i++) {
            boutonsChampions.add(new BoutonChampion(joueur.getPaquet().get(i),i));
            boutonsChampions.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    //Choisir ce champion pour aller au combat
                    boutonChampionChoisiAuCombat.setEntite( ( (BoutonChampion) (e.getSource()) ).getEntite() );
                    boutonChampionChoisiAuCombat.setIndiceBouton( ( (BoutonChampion) (e.getSource()) ).getIndiceBouton() );
                    conteneurCombattant.getChildren().addAll(boutonChampionChoisiAuCombat, combat);
                    Combat.super.setCenter(conteneurCombattant);
                    // a voir
                }
            });
            conteneurDesBoutonsChampion.getChildren().add(boutonsChampions.get(i)); // ajouter le bouton à la hbox
        }
    }
    public void verifieSiChampionVivant(){
        Combat.super.setCenter(null);
        Combat.super.setLeft(null);
        if( boutonChampionChoisiAuCombat.getEntite().getPointsVie() == 0){
            conteneurDesBoutonsChampion.getChildren().remove(boutonChampionChoisiAuCombat.getIndiceBouton());
            boutonsChampions.remove( boutonChampionChoisiAuCombat.getIndiceBouton() );
            return;
        }
        boutonsChampions.get( boutonChampionChoisiAuCombat.getIndiceBouton() ).setEntite(boutonChampionChoisiAuCombat.getEntite() );
        conteneurDesBoutonsChampion.getChildren().clear();
        initBoutonsChampions();
    }

    public abstract void combat();

    public BoutonChampion getBoutonChampionChoisiAuCombat() {
        return boutonChampionChoisiAuCombat;
    }

    public void asGagne(){
        if(Partie.asGagne){
            super.getScene().setRoot(new FinPartie());
        }
    }
}
