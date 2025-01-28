package Exercice5;

public class MainMaison {
    public static void main(String[] args) {

        Maison maison = new Maison();


        maison.ajouterPiece(new Piece("Chambre"));
        maison.ajouterPiece(new Piece("Cuisine"));
        maison.ajouterPiece(new Piece("Salon"));
        maison.ajouterPiece(new Piece("Salle de bain"));
        maison.ajouterPiece(new Piece("caca de bain"));


        maison.listerPieces();
    }

}
