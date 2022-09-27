package src.main.banque;

import java.util.Objects;

public class Compte {
    private double solde;
    private int numero;
    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void ajouter(double montant) {
        this.solde += montant;
    }
    public void retirer(double montant) {
        this.solde -= montant;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Banque{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Compte)) return false;
        if (!super.equals(object)) return false;
        Compte cp = (Compte) object;
        return java.lang.Double.compare(cp.getSolde(), getSolde()) == 0 && getNumero() == cp.getNumero();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getSolde(), getNumero());
    }
}