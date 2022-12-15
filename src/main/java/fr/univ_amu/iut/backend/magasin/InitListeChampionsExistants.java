package fr.univ_amu.iut.backend.magasin;

import fr.univ_amu.iut.backend.entites.*;

/**
 * Classe qui sert à initialiser la liste des champions qui pourront etre presents au magasin
 */
public class InitListeChampionsExistants {
    /**
     * Methode pour initialiser la liste
     */
    public static void InitListe(){
        //Creation Entites
        Assassin Alexandre = new Assassin ("Alexandre", 143, 51, 44, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alexandre);
        Yordle Marie = new Yordle ("Marie", 494, 1, 6, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Marie);
        Mage Thomas = new Mage ("Thomas", 90, 59, 25, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Thomas);
        Mage Paul = new Mage ("Paul", 14, 111, 28, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Paul);
        Erudit Emma = new Erudit ("Emma", 33, 57, 85, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Emma);
        Erudit Florian = new Erudit ("Florian", 43, 71, 85, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Florian);
        Mage Julien = new Mage ("Julien", 37, 168, 50, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Julien);
        Mage Lucie = new Mage ("Lucie", 39, 148, 28, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lucie);
        Combattant Romain = new Combattant ("Romain", 145, 14, 118, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Romain);
        Yordle Camille = new Yordle ("Camille", 396, 5, 0, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Camille);
        Erudit Laurent = new Erudit ("Laurent", 38, 41, 128, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Laurent);
        Erudit Alice = new Erudit ("Alice", 36, 58, 104, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alice);
        Combattant Guillaume = new Combattant ("Guillaume", 146, 15, 145, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Guillaume);
        Yordle Julie = new Yordle ("Julie", 164, 2, 3, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Julie);
        Assassin Maxime = new Assassin ("Maxime", 75, 31, 38, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Maxime);
        Assassin Lea = new Assassin ("Lea", 86, 29, 30, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lea);
        Yordle Nicolas = new Yordle ("Nicolas", 485, 10, 10, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Nicolas);
        Assassin Chloe = new Assassin ("Chloe", 97, 15, 30, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Chloe);
        Yordle Sebastien = new Yordle ("Sebastien", 314, 8, 8, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Sebastien);
        Assassin Manon = new Assassin ("Manon", 115, 52, 45, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Manon);
        Erudit Benjamin = new Erudit ("Benjamin", 29, 20, 147, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Benjamin);
        Yordle Ines = new Yordle ("Ines", 311, 9, 9, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Ines);
        Assassin Mathieu = new Assassin ("Mathieu", 132, 45, 40, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Mathieu);
        Yordle Clara = new Yordle ("Clara", 256, 1, 7, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Clara);
        Combattant David = new Combattant ("David", 100, 49, 116, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(David);
        Yordle Margaux = new Yordle ("Margaux", 408, 10, 5, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Margaux);
        Mage Vincent = new Mage ("Vincent", 51, 134, 25, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Vincent);
        Yordle Anne = new Yordle ("Anne", 64, 5, 8, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Anne);
        Erudit Antoine = new Erudit ("Antoine", 23, 26, 150, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Antoine);
        Combattant Lola = new Combattant ("Lola", 22, 29, 146, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lola);
        Erudit Arthur = new Erudit ("Arthur", 39, 39, 87, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Arthur);
        Combattant Oceane = new Combattant ("Oceane", 143, 5, 116, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Oceane);
        Yordle Kevin = new Yordle ("Kevin", 435, 6, 9, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Kevin);
        Erudit Sarah = new Erudit ("Sarah", 34, 45, 128, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Sarah);
        Yordle Raphael = new Yordle ("Raphael", 482, 5, 4, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Raphael);
        Erudit Elise = new Erudit ("Elise", 20, 46, 78, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Elise);
        Erudit Jeremy = new Erudit ("Jeremy", 19, 37, 78, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Jeremy);
        Assassin Charlotte = new Assassin ("Charlotte", 50, 46, 39, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Charlotte);
        Yordle Gauthier = new Yordle ("Gauthier", 427, 9, 7, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Gauthier);
        Combattant Melissa = new Combattant ("Melissa", 15, 65, 132, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Melissa);
        Erudit Jonathan = new Erudit ("Jonathan", 13, 17, 91, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Jonathan);
        Erudit Juliette = new Erudit ("Juliette", 43, 66, 86, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Juliette);
        Erudit Adrien = new Erudit ("Adrien", 33, 28, 88, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Adrien);
        Erudit Lucas = new Erudit ("Lucas", 22, 57, 115, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lucas);
        Assassin Cedric = new Assassin ("Cedric", 131, 48, 39, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Cedric);
        Yordle Amelie = new Yordle ("Amelie", 317, 2, 4, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Amelie);
        Combattant Bastien = new Combattant ("Bastien", 106, 69, 120, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Bastien);
        Assassin Coralie = new Assassin ("Coralie", 59, 12, 30, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Coralie);
        Combattant Tristan = new Combattant ("Tristan", 48, 72, 147, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Tristan);
        Yordle Justine = new Yordle ("Justine", 145, 10, 7, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Justine);
        Yordle Hugo = new Yordle ("Hugo", 365, 6, 1, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Hugo);
        Assassin Eleonore = new Assassin ("Eleonore", 66, 52, 39, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Eleonore);
        Mage Yann = new Mage ("Yann", 13, 105, 70, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Yann);
        Mage Lisa = new Mage ("Lisa", 56, 22, 26, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lisa);
        Assassin Simon = new Assassin ("Simon", 96, 7, 37, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Simon);
        Assassin Lilou = new Assassin ("Lilou", 98, 35, 44, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lilou);
        Yordle Etienne = new Yordle ("Etienne", 325, 5, 7, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Etienne);
        Mage Maelys = new Mage ("Maelys", 96, 32, 66, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Maelys);
        Combattant Damien = new Combattant ("Damien", 20, 45, 145, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Damien);
        Assassin Mila = new Assassin ("Mila", 127, 23, 43, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Mila);
        Assassin Fabien = new Assassin ("Fabien", 109, 45, 37, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Fabien);
        Assassin Lina = new Assassin ("Lina", 113, 21, 39, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lina);
        Yordle Alexis = new Yordle ("Alexis", 458, 7, 9, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alexis);
        Yordle Jade = new Yordle ("Jade", 65, 4, 8, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Jade);
        Mage Maxence = new Mage ("Maxence", 116, 59, 27, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Maxence);
        Assassin Julia = new Assassin ("Julia", 147, 55, 32, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Julia);
        Erudit Aaron = new Erudit ("Aaron", 25, 41, 75, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Aaron);
        Mage Estelle = new Mage ("Estelle", 41, 146, 27, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Estelle);
        Yordle Christopher = new Yordle ("Christopher", 111, 6, 0, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Christopher);
        Yordle Heloise = new Yordle ("Heloise", 220, 1, 2, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Heloise);
        Erudit Steven = new Erudit ("Steven", 32, 9, 82, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Steven);
        Combattant Emilie = new Combattant ("Emilie", 98, 36, 113, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Emilie);
        Erudit Thibault = new Erudit ("Thibault", 44, 70, 82, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Thibault);
        Combattant Jules = new Combattant ("Jules", 20, 11, 135, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Jules);
        Mage Mailys = new Mage ("Mailys", 31, 183, 68, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Mailys);
        Yordle Gabin = new Yordle ("Gabin", 394, 9, 8, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Gabin);
        Assassin Noemie = new Assassin ("Noemie", 133, 43, 44, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Noemie);
        Mage Clement = new Mage ("Clement", 47, 152, 62, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Clement);
        Mage Lilas = new Mage ("Lilas", 94, 119, 75, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lilas);
        Combattant Aymeric = new Combattant ("Aymeric", 25, 43, 119, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Aymeric);
        Assassin Quentin = new Assassin ("Quentin", 70, 30, 45, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Quentin);
        Combattant Eva = new Combattant ("Eva", 95, 4, 102, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Eva);
        Assassin Theo = new Assassin ("Theo", 90, 59, 36, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Theo);
        Mage Lena = new Mage ("Lena", 42, 38, 34, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lena);
        Assassin Erwan = new Assassin ("Erwan", 149, 24, 45, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Erwan);
        Combattant Alison = new Combattant ("Alison", 129, 59, 137, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alison);
        Yordle Sacha = new Yordle ("Sacha", 117, 1, 5, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Sacha);
        Assassin Garance = new Assassin ("Garance", 62, 58, 46, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Garance);
        Erudit Ludovic = new Erudit ("Ludovic", 40, 36, 83, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Ludovic);
        Combattant Hanna = new Combattant ("Hanna", 97, 6, 125, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Hanna);
        Combattant Tyler = new Combattant ("Tyler", 121, 69, 100, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Tyler);
        Combattant Clemence = new Combattant ("Clemence", 20, 11, 131, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Clemence);
        Combattant Noah = new Combattant ("Noah", 59, 66, 143, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Noah);
        Erudit Victor = new Erudit ("Victor", 15, 69, 144, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Victor);
        Mage Amandine = new Mage ("Amandine", 36, 3, 50, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Amandine);
        Mage Corentin = new Mage ("Corentin", 87, 97, 68, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Corentin);
        Mage Samuel = new Mage ("Samuel", 20, 171, 54, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Samuel);
        Yordle Margot = new Yordle ("Margot", 323, 5, 1, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Margot);
        Erudit Martin = new Erudit ("Martin", 19, 54, 121, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Martin);
        Erudit Louna = new Erudit ("Louna", 15, 46, 117, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Louna);
        Assassin Eliott = new Assassin ("Eliott", 126, 32, 47, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Eliott);
        Assassin Romane = new Assassin ("Romane", 94, 39, 35, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Romane);
        Mage Valentin = new Mage ("Valentin", 37, 48, 46, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Valentin);
        Yordle Luna = new Yordle ("Luna", 138, 6, 4, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Luna);
        Assassin Jordan = new Assassin ("Jordan", 108, 9, 46, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Jordan);
        Mage Noa = new Mage ("Noa", 111, 155, 21, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Noa);
        Yordle Leo = new Yordle ("Leo", 488, 1, 7, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Leo);
        Mage Cloe = new Mage ("Cloe", 111, 119, 40, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Cloe);
        Erudit Gregoire = new Erudit ("Gregoire", 29, 74, 144, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Gregoire);
        Erudit Elisa = new Erudit ("Elisa", 24, 65, 81, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Elisa);
        Combattant Max = new Combattant ("Max", 24, 34, 132, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Max);
        Combattant Oona = new Combattant ("Oona", 121, 66, 118, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Oona);
        Erudit Edward = new Erudit ("Edward", 48, 50, 150, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Edward);
        Yordle Livia = new Yordle ("Livia", 174, 7, 0, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Livia);
        Mage Evan = new Mage ("Evan", 62, 121, 24, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Evan);
        Mage Lili = new Mage ("Lili", 104, 65, 66, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lili);
        Yordle Timothee = new Yordle ("Timothee", 141, 8, 1, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Timothee);
        Assassin Nina = new Assassin ("Nina", 67, 9, 35, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Nina);
        Mage Nathan = new Mage ("Nathan", 86, 122, 61, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Nathan);
        Mage Maeva = new Mage ("Maeva", 39, 4, 31, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Maeva);
        Assassin Axel = new Assassin ("Axel", 71, 58, 48, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Axel);
        Mage Alicia = new Mage ("Alicia", 118, 58, 50, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alicia);
        Assassin Alex = new Assassin ("Alex", 50, 27, 35, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alex);
        Erudit Adele = new Erudit ("Adele", 17, 51, 129, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Adele);
        Combattant Marius = new Combattant ("Marius", 94, 54, 116, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Marius);
        Yordle Aurelie = new Yordle ("Aurelie", 28, 7, 6, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Aurelie);
        Mage Baptiste = new Mage ("Baptiste", 100, 167, 71, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Baptiste);
        Mage Leane = new Mage ("Leane", 87, 166, 56, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Leane);
        Mage Sylvain = new Mage ("Sylvain", 18, 122, 66, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Sylvain);
        Mage Alix = new Mage ("Alix", 57, 150, 55, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Alix);
        Yordle Zozo = new Yordle ("Zozo", 396, 6, 10, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Zozo);
        Assassin Enzo = new Assassin ("Enzo", 94, 55, 47, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Enzo);
        Yordle Pelvin = new Yordle ("Pelvin", 103, 9, 3, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Pelvin);
        Erudit Mohammed = new Erudit ("Mohammed", 25, 24, 103, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Mohammed);
        Yordle PatesAuSucre = new Yordle ("PatesAuSucre", 405, 8, 9, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(PatesAuSucre);
        Assassin Malex = new Assassin ("Malex", 112, 36, 46, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Malex);
        Combattant Lenny = new Combattant ("Lenny", 70, 40, 125, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Lenny);
        Mage Moktar = new Mage ("Moktar", 70, 77, 29, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Moktar);
        Assassin Boulette = new Assassin ("Boulette", 74, 27, 44, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Boulette);
        Yordle PatesAuBeurre = new Yordle ("PatesAuBeurre", 354, 4, 0, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(PatesAuBeurre);
        Yordle Pelouse = new Yordle ("Pelouse", 454, 3, 6, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Pelouse);
        Mage Pils = new Mage ("Pils", 42, 4, 70, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Pils);
        Assassin Fils = new Assassin ("Fils", 90, 40, 48, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Fils);
        Assassin Kils = new Assassin ("Kils", 75, 39, 49, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Kils);
        Mage Tils = new Mage ("Tils", 76, 8, 58, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Tils);
        Mage Zils = new Mage ("Zils", 76, 168, 26, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Zils);
        Yordle Sils = new Yordle ("Sils", 497, 7, 7, Rarete.LEGENDAIRE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Sils);
        Assassin Mils = new Assassin ("Mils", 144, 13, 31, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Mils);
        Yordle Gils = new Yordle ("Gils", 193, 2, 5, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Gils);
        Mage Wils = new Mage ("Wils", 38, 56, 63, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Wils);
        Assassin Xils = new Assassin ("Xils", 134, 1, 39, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Xils);
        Yordle Cils = new Yordle ("Cils", 148, 2, 6, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Cils);
        Mage Ragnar = new Mage ("Ragnar", 22, 103, 40, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Ragnar);
        Yordle Fredo = new Yordle ("Fredo", 443, 6, 4, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Fredo);
        Assassin Fredos = new Assassin ("Fredos", 129, 30, 40, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Fredos);
        Combattant Momox = new Combattant ("Momox", 30, 52, 136, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Momox);
        Erudit DjibSan = new Erudit ("DjibSan", 11, 32, 75, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(DjibSan);
        Mage Shori = new Mage ("Shori", 94, 200, 38, Rarete.COMMUN);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Shori);
        Erudit Fred = new Erudit ("Fred", 22, 69, 119, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Fred);
        Erudit Luca = new Erudit ("Luca", 47, 31, 125, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Luca);
        Mage Nils = new Mage ("Nils", 76, 167, 70, Rarete.RARE);
        ApprovisionnementMagasin.ajouterALaListeDesChampionsExistants(Nils);
    }
}
