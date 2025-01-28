package CalculableAvance;

public class Cercle implements CalculableAvance{


    @Override
    public double calculerSurfaceCercle(double rayon) {
        return CalculableAvance.PI * (rayon*rayon);
    }
}
