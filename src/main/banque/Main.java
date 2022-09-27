package src.main.banque;

public class Main {
    public static void main(String[] args) {
        Compte courrant = new Compte(1);
        Compte joint = new Compte(2,500);

        Client michel = new Client( "Trabendo", "Michel", 59, 1);
        System.out.println(michel);

        michel.ajouterCompte(courrant);
        System.out.println(michel);

        michel.getCompte(1).ajouter(200);
        System.out.println(michel);
        System.out.println(courrant);

        joint.retirer(12);
        System.out.println(joint);
        michel.ajouterCompte(joint);
        System.out.println(michel);

        Compte[] comptes = {courrant, joint, null, null, null};
        System.out.println(comptes);
        Client cyriak = new Client("Leclercq", "Cyriak", 12, 2);
        System.out.println(cyriak);
    }
}
