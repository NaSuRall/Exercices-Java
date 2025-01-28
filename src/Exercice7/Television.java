package Exercice7;

public class Television extends AppareilElectrique implements Connectable {

    public Television(int puissance) {
        super(puissance);
    }

    @Override
    public void allumer() {
        System.out.println("Télévision allumée.");
    }

    @Override
    public void connecter() {
        System.out.println("Télévision connectée au réseau !");
    }
}