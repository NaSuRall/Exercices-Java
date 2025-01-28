package Exercice10;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque  {

    List<Ressource> ressources;

    public Bibliotheque(List<Ressource> ressources) {
        this.ressources = ressources;
    }

    public static void ajouterRessource(Ressource ressource) {
        List<Ressource> ressources = new ArrayList<Ressource>();
        ressources.add(ressource);
    }

    public static void supprimerRessources(Ressource ressource) {
        List<Ressource> ressources1 = new ArrayList<>();
        ressources1.remove(ressource);
    }

}
