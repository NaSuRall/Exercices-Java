package Exercice6;

import java.util.ArrayList;
import java.util.List;

public class Universite {





    private List<Etudiant> etudiants;

    public Universite() {
        this.etudiants = new ArrayList<>();
    }

    public void ajoutEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void retirEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    public void afficherListeEtudiants() {
        System.out.println("Voici la liste des Etudiants dans le lycée : ");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

}
