package Exercice4;

public abstract class Vehicule {

    String marque;

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public abstract void demarrer();

    public static void arreter() {
        System.out.println("Vehicule arreter");
    }

}
