package src.main.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

    private double seuil;

    public CompteASeuilRemunere(double seuil) {
        this.seuil = seuil;
    }

    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
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
    public void retirer(double montant) throws BanqueException {
        double ope = this.getSolde() - montant;
        if (ope <= this.getSeuil()) {
            System.err.println("Impossible de retirer la somme " + montant + " sur le compte n°" + this.getNumero() + " !");
        } else {
            super.retirer(montant);
        }
    }

}