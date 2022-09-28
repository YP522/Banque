package src.main.banque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws BanqueException {
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

        Client Jean = new Client("Dupont", "Jean", 12, 2);
        System.out.println(Jean);

//        test exception
        CompteASeuilRemunere casr = new CompteASeuilRemunere(5,7000,0.1,500);
        Jean.ajouterCompte(casr);

        Compte[] compteJean = Jean.getComptes().toArray(new Compte[0]);
        System.out.println(Arrays.toString(compteJean));

        for(Compte cp : compteJean){
            if(cp instanceof CompteRemunere){
                CompteRemunere cr = (CompteRemunere) cp;
                cr.verserInterets();
            }
        }

        System.out.println(Arrays.toString(compteJean));
//        try {
            Jean.getCompte(5).retirer(77000);
//        }catch (){

//        }


        List<Compte> listComptes = new ArrayList<>();
        listComptes.add(courrant);

        System.out.println(listComptes);
        listComptes.iterator();

        for (Compte lc : listComptes){
            System.out.println(lc);
        }










    }
}
