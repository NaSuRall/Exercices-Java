package Exercice4;

public class Voiture  extends Vehicule {

    
    public Voiture(String marque) {
        super(marque);
    }
    @Override
    public void demarrer(){
        System.out.println("Vehicule Demarer !");
    }


}
