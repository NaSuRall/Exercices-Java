package Exercice10;

public class OrdinateurEnLibreAcces extends Ressource implements ConsultableSurPlace{

    public OrdinateurEnLibreAcces(String titre) {
        super(titre);
    }

    @Override
    public void afficherInfo() {

    }

    @Override
    public boolean consulterSurPlace() {
        return false;
    }
}
