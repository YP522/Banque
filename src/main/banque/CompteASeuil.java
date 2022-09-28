package src.main.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
    private double seuil;

    public CompteASeuil() {
        this(-1, 0D, 0D);
    }

    public CompteASeuil(int numero, double solde, double seuil) {
        super(numero, solde);
        this.setSeuil(seuil);
    }

    @Override
    public double getSeuil() {
        return this.seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                '}';
    }
}
