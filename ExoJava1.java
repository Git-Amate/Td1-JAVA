import java.util.Scanner;

public class exoJava1 {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        System.out.println("Entrez une année");
        int annee = objet.nextInt();
        if ((annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0)) {
            System.out.print("L'annee est bissextile");
        } else {
            System.out.print("L'annee n'est pas bissextile");
        }
    }

}
