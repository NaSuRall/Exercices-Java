package Exercice7;

public abstract class AppareilElectrique {

    private int puissance;

    public AppareilElectrique(int puissance) {
        this.puissance = puissance;
    }


    public abstract void allumer();

}
