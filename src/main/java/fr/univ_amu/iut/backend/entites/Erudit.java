package fr.univ_amu.iut.backend.entites;

public class Erudit extends Entite {

    public Erudit(String nom, int pointsAttaque, int pointsVie, int pointsDefense, Rarete rarete) {
        super(nom, pointsAttaque, pointsVie, pointsDefense, rarete);
    }

    @Override
    public void competence() {
        System.out.println("lui jsp");
    }

    @Override
    public String toString() {
        return "Erudit{rarete=" + getRarete() + ", nom=" + getNom()
                + ", pointsAttaque=" + getPointsAttaque()
                + ", pointsDefense=" + getPointsDefense()
                + ", pointsVie=" + getPointsVie()
                + "}";
    }

    @Override
    public String getType(){
        return "Erudit";
    }
}
