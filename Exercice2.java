import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int a = sc.nextInt();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        String op = sc.next();

        System.out.print("Entrez le deuxième nombre : ");
        int b = sc.nextInt();

        int result = 0;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Erreur : division par zéro");
                sc.close();
                return;
            }
            result = a / b;
        } else {
            System.out.println("Erreur : opération invalide");
            sc.close();
            return;
        }

        System.out.println("Résultat : " + result);

        // Deuxième saisie
        System.out.println("\nDeuxième saisie :");
        System.out.print("Entrez une nouvelle opération (+, -, *, /) : ");
        String newOp = sc.next();

        System.out.print("Entrez un autre nombre : ");
        int c = sc.nextInt();

        if (newOp.equals("+")) {
            result = result + c;
        } else if (newOp.equals("-")) {
            result = result - c;
        } else if (newOp.equals("*")) {
            result = result * c;
        } else if (newOp.equals("/")) {
            if (c == 0) {
                System.out.println("Erreur : division par zéro");
                sc.close();
                return;
            }
            result = result / c;
        } else {
            System.out.println("Erreur : opération invalide");
            sc.close();
            return;
        }

        System.out.println("Résultat final : " + result);

        sc.close();
    }
}
