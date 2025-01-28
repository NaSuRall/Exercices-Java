package Exercice7;

    public class Ordinateur extends AppareilElectrique implements Connectable {

        public Ordinateur(int puissance) {
            super(puissance);
        }

        @Override
        public void allumer() {
            System.out.println("Ordinateur allumé.");
        }

        @Override
        public void connecter() {
            System.out.println("Ordinateur connecté au réseau !");
        }
    }

