package Exercice8;

public class MainFerme {



    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        Chat chat = new Chat();
        Chien chien = new Chien();
        Vache vache = new Vache();
        Ferme ferme = new Ferme();
        chien.emettreSon();
        chat.emettreSon();
        vache.emettreSon();
        vache.allaiter();

    }

}

