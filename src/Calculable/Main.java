package Calculable;

public class Main {


    public static void main(String[] args) {

      Addition addition = new Addition();
      Multiplication multiplication = new Multiplication();


        double x = 2;
        double y = 3;


        System.out.println("le resultat de l'addition" + x + "+" + y + " est = " + addition.calculate(x, y));
        System.out.println("le resultat de l'addition" + x + "*" + y + " est = " + multiplication.calculate(x, y));


    }
}