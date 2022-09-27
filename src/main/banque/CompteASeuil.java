package src.main.banque;

public class CompteASeuil {
    private double seuil;
    private double solde;
    public CompteASeuil(double seuil, double solde) {
        this.seuil = seuil;
        this.solde = solde;
    }
    public void retirer(double montant) {
        if (solde - montant < seuil) {
            System.out.println("Solde insuffisant");
        } else {
            solde -= montant;
        }
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                ", solde=" + solde +
                '}';
    }
}