import java.util.Scanner;

public class CompterChiffres {

    // Lecture 
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: l'entier doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }

    // Compter 
    public static int Compter(int n) {
        int s = 0;
        while (n != 0) {
            n = n / 10;
            s++;
        }
        return s;
    }

    // Affichage
    public static void main(String[] args) {
        int n = lectureN();
        int nbrch = Compter(n);
        System.out.println("Le nombre contient " + nbrch + " chiffre(s).");
    }
}