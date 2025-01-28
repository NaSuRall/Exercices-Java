package Exercice5;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Maison {

        private List<Piece> pieces;


        public Maison() {
            this.pieces = new ArrayList<>();
        }

        public void ajouterPiece(Piece piece) {
            pieces.add(piece);
        }

        public void listerPieces() {
            System.out.println("Liste des pièces de la maison :");
            for (Piece piece : pieces) {
                System.out.println("- " + piece.getNom());
            }
        }


}
