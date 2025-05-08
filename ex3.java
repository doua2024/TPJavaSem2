import java.util.Scanner;

public class ex3 {

    public static void remplir(int[] tableau) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir " + tableau.length + " entiers :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entier n°" + (i+1) + " : ");
            tableau[i] = scanner.nextInt();
        }
    }
    public static void trier(int[] tableau) {
        for (int i = 0; i < tableau.length-1; i++) {
            int indiceMin = i;
            for (int j = i+1; j < tableau.length; j++) {
                if (tableau[j] < tableau[indiceMin]) {
                    indiceMin = j;
                }
            }
            if (indiceMin != i) {
                int temp = tableau[i];
                tableau[i] = tableau[indiceMin];
                tableau[indiceMin] = temp;
            }
        }
    }

    public static void afficher(int[] tableau) {
        System.out.print("[ ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        final int TAILLE = 5; 
        int[] tableau = new int[TAILLE];
 
        remplir(tableau);

        System.out.print("\nAvant tri : ");
        afficher(tableau);
    
        trier(tableau);
       
        System.out.print("Après tri : ");
        afficher(tableau);
    }
}