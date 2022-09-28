package src.main.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private double taux;

    public CompteRemunere() {
        this(-1,0.0, 0.0);
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super( numero, solde);
        this.setTaux(taux);

    }

    public double getTaux() {
        return this.taux;
    }

    @Override
    public void setTaux(double taux) {
        if (taux < 0 || taux >= 1) {
            System.err.println("Le taux doit être entre 0 inclus et 1 exclus !");
        } else {
            this.taux = taux;
        }
    }


    public double calculerInterets() {
        return super.getSolde() * this.getTaux();
    }

    public void verserInterets() {
        super.ajouter(this.calculerInterets());
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                '}';
    }
}