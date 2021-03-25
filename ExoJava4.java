import java.util.Scanner;

public class ExoJava4 {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        System.out.println("Voici le modele jj/mm/aa");
        System.out.println("Entrez le jours sous la forme jj");
        int jour = objet.nextInt();
        System.out.println("Entrez le mois sous la forme mm");
        int mois = objet.nextInt();
        System.out.println("Entrez l'annee sous la forme aa");
        int annee = objet.nextInt();
        if ((jour > 0 || jour < 31) && (mois > 0 || mois < 12)) {
            System.out.println("hello");
            if (mois < 12 && jour < 31) {
                System.out.println("la date suivante est:");
                jour++;
                System.out.println(jour + "/" + mois + "/" + annee);
            }
            if (jour == 31 && mois < 12) {
                System.out.println("la date suivante est:");
                mois++;
                jour = 1;
                System.out.println(jour + "/" + mois + "/" + annee);
            }
            if (jour == 31 && mois == 12) {
                jour = 01;
                mois = 01;
                annee++;
                System.out.println(jour + "/" + mois + "/" + annee);
            }
        }

    }
}
