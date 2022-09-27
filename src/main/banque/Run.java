package src.main.banque;

public class Run {
    public static void main(String[] args) {
        Compte cp = new Compte(105.50,1);
        System.out.println(cp.getSolde());
        cp.ajouter(3500.00);
        System.out.println(cp.getSolde());
        cp.retirer(500.00);
        System.out.println(cp.getSolde());
        cp.ajouter(84612.36);
        System.out.println(cp.getSolde());
        System.out.println(cp.toString());

        Client cli = new Client("Dupont", "Jean", 50, 1);
        System.out.println(cli.toString());
        cli.ajouterCompte(cp);
        cli.setAge(51);
        System.out.println(cli.toString());
        System.out.println(cli.getCompte(1));
    }
}