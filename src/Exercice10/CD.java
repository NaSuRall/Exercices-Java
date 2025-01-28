package Exercice10;

public class CD extends Ressource implements Empruntable{

    public CD(String titre) {
        super(titre);
    }

    @Override
    public void afficherInfo() {
        System.out.println("Voici l'information du cd");
    }

}
