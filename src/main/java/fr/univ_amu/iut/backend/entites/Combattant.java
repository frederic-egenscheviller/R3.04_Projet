package fr.univ_amu.iut.backend.entites;

public class Combattant extends Entite {

    protected final int POINTS_DE_DEFENSE_MIN = 100;
    private final int POINTS_DE_DEFENSE_MAX = 150;
    private final int POINTS_DE_ATTAQUE_MAX = 150;
    private final int POINTS_DE_VIE_MAX = 75;
    public Combattant(String nom, int pointsAttaque, int pointsVie, int pointsDefense, Rarete rarete) {
        super(nom, pointsAttaque, pointsVie, pointsDefense, rarete);
    }
    @Override
    public String toString() {
        return "Combattant{rarete=" + getRarete() + ", nom=" + getNom()
                + ", pointsAttaque=" + getPointsAttaque()
                + ", pointsDefense=" + getPointsDefense()
                + ", pointsVie=" + getPointsVie()
                + "}";
    }

    @Override
    public String getType(){
        return "Combattant";
    }
    @Override
    protected int getMinDef(){
        return POINTS_DE_DEFENSE_MIN;
    }
    @Override
    protected int getMaxDef(){
        return POINTS_DE_DEFENSE_MAX;
    }
    @Override
    protected int getMaxAtt(){return POINTS_DE_ATTAQUE_MAX;}
    @Override
    protected int getMaxVie(){
        return POINTS_DE_VIE_MAX;
    }
}
