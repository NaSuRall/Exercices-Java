package Exercice6;

import java.sql.SQLOutput;
import java.util.List;

public class MainUniversite {


    public static void main(String[] args) {


        Universite universite = new Universite();

        Etudiant etudiant1 = new Etudiant("Romain", "Poulain");
        Etudiant etudiant2 = new Etudiant("Roma", "Poun");
        Etudiant etudiant3 = new Etudiant("Julie", "Paris");
        Etudiant etudiant4 = new Etudiant("Axel", "Thibault");

        universite.ajoutEtudiant(etudiant1);
        universite.ajoutEtudiant(etudiant2);
        universite.ajoutEtudiant(etudiant3);
        universite.ajoutEtudiant(etudiant4);


        universite.afficherListeEtudiants();

        System.out.println(" ");
        universite.retirEtudiant(etudiant1);
        System.out.println(" ");
        System.out.println(" ----------------------------------------------------");
        System.out.println(" ");
        Etudiant etudiantPasEcole = etudiant1;
        System.out.println("Eleve plus etudiant dans le lycee :");
        System.out.println(etudiantPasEcole);
        System.out.println(" ");
        System.out.println(" ----------------------------------------------------");
        System.out.println(" ");

        System.out.println(" ----------------------------------------------------");
        System.out.println(" ");
        universite.afficherListeEtudiants();
        System.out.println(" ");
        System.out.println(" ----------------------------------------------------");







    }




}
