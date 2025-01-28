package Exercice4;

public class MainVehicule {

    public static void main(String[] args) {


    Vehicule[] vehicules = new Vehicule[3];

    vehicules[0] = new Voiture("BMW");
    vehicules[1] = new Moto("Yahama");
    vehicules[2] = new Voiture("huyn");



    for (int i = 0; i < vehicules.length; i++) {
        System.out.println(vehicules[0].marque);
        vehicules[0].demarrer();
        System.out.println(vehicules[1].marque);
        vehicules[1].demarrer();
        System.out.println(vehicules[2].marque);
        vehicules[2].demarrer();

        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        vehicules[0].arreter();
        vehicules[1].arreter();
        vehicules[2].arreter();
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");


    }


    }
}
