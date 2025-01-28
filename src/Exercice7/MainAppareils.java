package Exercice7;


public class MainAppareils {

    public static void main(String[] args) {

        AppareilElectrique[] appareils = new AppareilElectrique[3];


        appareils[0] = new Television(150);
        appareils[1] = new Ordinateur(200);
        appareils[2] = new Television(120);


        for (int i = 0; i < appareils.length; i++) {

            AppareilElectrique appareil = appareils[i];
            appareil.allumer();


            if (appareil instanceof Connectable) {
                Connectable connectable = (Connectable) appareil;
                connectable.connecter();
            }
            System.out.println(" ");
        }

        }
    }
