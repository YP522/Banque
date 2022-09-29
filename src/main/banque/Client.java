package src.main.banque;

import java.util.*;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;

    private List<Compte> comptes;
//    private Map<Integer, Compte> comptes;

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.comptes = new ArrayList<>();
//        this.comptes = new HashMap<>();
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

    public List<Compte> getComptes() {
        return comptes;
    }

//    public Compte[] getComptes() {
//        return this.comptes.values().toArray(new Compte[this.comptes.size()]);
//    }

    public Compte getCompte(int numero) {
        for (Compte compte : this.comptes) {
            if(compte.getNumero() == numero){
                return compte;
            }
        }
        System.err.println("Pas de compte enregistrée avec ce numero");
        return null;
    }

//    public Compte getCompte(int numero) {
//        return this.comptes.get(numero);
//    }


    public void setComptes(Compte[] comptes) {
        if(comptes.length<=5) {
            this.comptes = (List<Compte>) List.of(comptes);
        }
        System.err.println("Maximum de compte atteint");
    }

    public void ajouterCompte(Compte unCompte) throws BanqueException {
        if (this.comptes.size() >= 5) {
            throw new BanqueException("Le tableau est plein !");
        }
        this.comptes.add(unCompte);
    }
//public void ajouterCompte(Compte unCompte) throws BanqueException {
//    if (this.comptes.size() >= 5) {
//        throw new BanqueException("Le tableau est plein !");
//    }
//    this.comptes.put(unCompte.getNumero(), unCompte);
//}


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + comptes +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; } if ((obj == null) || (this.getClass() != obj.getClass())) { return false; } var other = (Client) obj; if (this.numero != other.numero) { return false; } return true;
    }


    @Override
    public int hashCode() {
        return (this.getClass().getName() + "_" + this.getNumero()).hashCode();
    }


}