import java.util.Scanner;

public class ExoJava2 {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        System.out.println("Entrez une année");
        int annee = objet.nextInt();
        System.out.println("Entrez l'indiacatif du mois");
        int mois = objet.nextInt();
        switch (mois) {
        case 1:
            System.out.println(31);
            break;
        case 2:
            if ((annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0)) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
            break;
        case 3:
            System.out.println(30);
            break;
        case 4:
            System.out.println(31);
            break;
        case 5:
            System.out.println(30);
            break;

        default:
            break;
        }
    }

}
