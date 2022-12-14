package fr.univ_amu.iut.interface_application.fenetres.connexion;

import fr.univ_amu.iut.backend.outils.multijoueur.serveur.Serveur;
import fr.univ_amu.iut.backend.outils.multijoueur.serveur.NotifierConnexion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.*;
import java.util.Enumeration;

/**
 * Classe Heberger qui permet de creer un serveur pour heberger une partie de jeu
 */
public class Heberger extends BorderPane {
    private Button heberger = new Button("Cliquez ici pour heberger la partie");
    private Label texteDeAttente = new Label("En attente qu'un autre joueur vous rejoigne ...");

    private Label IPLocale = new Label();
    private VBox texteAttenteIPLocale = new VBox();
    public static Serveur serveur;

    /**
     * Constructeur de la classe Heberger
     */
    public Heberger() {
        super();
        super.setId("arrierePlan_heberger");
        initialisationBoutons();
        super.setCenter(heberger);
        initialisationTexteEtIp();
    }

    /**
     * Methode qui initialise les boutons
     */
    private void initialisationBoutons(){
        heberger.getStyleClass().add("bouton_management");
        heberger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Heberger.super.setCenter(texteAttenteIPLocale);
                serveur = new Serveur(10013);
                Thread attendre = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            serveur.connexion();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                NotifierConnexion notifierConnexion = new NotifierConnexion(Heberger.super.getScene());
                serveur.ajoutObserver(notifierConnexion);
                attendre.start();
            }
        });
    }

    /**
     * Methode qui initialise le texte et l'adresse IP locale
     */
    public void initialisationTexteEtIp()  {
        texteAttenteIPLocale.setId("conteneurIPTexteHeberger");

        try {
            IPLocale.setText("Votre adresse IP est : " + recupererIpLocale().toString().substring(1));
        } catch (UnknownHostException e) {
            System.out.println("Impossible de recuperer votre adresse IP");;
        }

        texteAttenteIPLocale.getChildren().addAll(texteDeAttente, IPLocale);
    }

    /**
     * Methode qui permet de recuperer l'adresse IP locale
     * @return l'adresse IP locale
     * @throws UnknownHostException
     */
    public InetAddress recupererIpLocale() throws UnknownHostException {
        try {
            for (Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces(); interfaces.hasMoreElements();) {
                NetworkInterface networkInterface = interfaces.nextElement();
                if (networkInterface.isLoopback() || !networkInterface.isUp())
                    continue;

                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    if (addr.isLoopbackAddress())
                        continue;

                    if (addr instanceof Inet4Address)
                        return addr;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return InetAddress.getLocalHost();
    }

    /**
     * Methode qui permet de recuperer le serveur
     * @return le serveur
     */
    public static Serveur getServeur() {
        return serveur;
    }
}
