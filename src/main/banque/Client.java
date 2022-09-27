package src.main.banque;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;

    private Compte[] comptes;

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.comptes = new Compte[5];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public Compte getCompte(int numero) {
        for (Compte compte : this.comptes) {
            if(compte.getNumero() == numero){
                return compte;
            }
        }
        System.err.println("Pas de compte enregistrée avec ce numero");
        return null;
    }

    public void setComptes(Compte[] comptes) {
        if(comptes.length<=5) {
            this.comptes = comptes;
        }
        System.err.println("Maximum de compte atteint");
    }

    public void ajouterCompte(Compte compte) {
        for(int i=0; i<this.comptes.length; i++){
            if(this.comptes[i]==null){
                this.comptes[i] = compte;
            }
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getAge() == client.getAge() && getNumero() == client.getNumero() && Objects.equals(getNom(), client.getNom()) && Objects.equals(getPrenom(), client.getPrenom()) && Arrays.equals(getComptes(), client.getComptes());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNom(), getPrenom(), getAge(), getNumero());
        result = 31 * result + Arrays.hashCode(getComptes());
        return result;
    }

}