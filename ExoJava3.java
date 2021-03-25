import java.util.Scanner;

public class ExoJava3 {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        System.out.println("Voici le modele jj/mm/aa");
        System.out.println("Entrez le jours sous la forme jj");
        int jour = objet.nextInt();
        System.out.println("Entrez le mois sous la forme mm");
        int mois = objet.nextInt();
        System.out.println("Entrez l'annee sous la forme aa");
        int annee = objet.nextInt();
        if ((jour > 0 && jour < 31) && (mois > 0 && mois < 12)) {
            System.out.println("La date saisie est correct");

        } else
            System.out.println("La date saisie est incorrecte");

    }

}
