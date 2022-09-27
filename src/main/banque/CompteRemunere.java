package src.main.banque;

public class CompteRemunere {
    private double taux;
    private double solde;

    public CompteRemunere(double taux, double solde) {
        this.taux = taux;
        this.solde = solde;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void calculerInterets() {
        solde = solde + solde * taux;
    }

    public void verserInterets() {
        solde = solde + solde * taux;
    }
}