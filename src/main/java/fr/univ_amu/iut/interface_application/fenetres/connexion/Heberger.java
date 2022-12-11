package fr.univ_amu.iut.interface_application.fenetres.connexion;

import fr.univ_amu.iut.backend.outils.multijoueur.serveur.Serveur;
import fr.univ_amu.iut.backend.outils.multijoueur.serveur.NotifierConnexion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Heberger extends BorderPane {
    private Button heberger = new Button("Cliquez ici pour heberger la partie");
    private Label texteDeAttente = new Label("En attente que un autre joueur vous rejoigne ...");
    public Heberger(){
        super();
        initialisationBoutons();
        super.setCenter(heberger);
    }

    private void initialisationBoutons(){
        heberger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //Stuff
                Heberger.super.setCenter(texteDeAttente);
                Serveur serveur = new Serveur(10013);
                Thread receive = new Thread(new Runnable() {
                    String msg;

                    @Override
                    public void run() {
                        try {
                            serveur.launch();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                NotifierConnexion notifierConnexion = new NotifierConnexion(Heberger.super.getScene(),receive);
                serveur.addObserver(notifierConnexion);
                receive.start();
            }
        });
    }
}
