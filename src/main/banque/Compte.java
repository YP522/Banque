package src.main.banque;

import java.util.Objects;

public class Compte {
    private double solde;
    private int numero;

    public Compte(){
         this(-1,0.0);
    }

    public Compte(int numero){
        this(numero, 0.0);
    }

    public Compte(int numero, double solde) {
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
    public void retirer(double montant) throws BanqueException {
        this.setSolde(this.getSolde() - montant);
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Banque{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Compte) {
            Compte c = (Compte) obj;
            return this.getNumero() == c.getNumero();
        }
        return false;
    }


    public int hashCode() {
        return Objects.hash(super.hashCode(), getSolde(), getNumero());
    }
}