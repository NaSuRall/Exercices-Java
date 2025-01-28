package Exercice10;

public class Livre extends Ressource implements Empruntable{


    public Livre(String titre) {
        super(titre);
    }

    @Override
    public void afficherInfo() {
        System.out.println("voici l'info du livre");
    }


}
