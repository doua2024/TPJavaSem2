

public class ex1 {
    public static double somme(double[] tab) {
        double total = 0.0;
        for (double num : tab) {
            total += num;
        }
        return total;
    }
    
    public static void incre(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }
    
    public static void afficher(double[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        double[] donnees = {1.1, 2.2, 3.3, 4.4};
     
        System.out.println("--- Démonstration TableauUtils ---");
        System.out.print("Tableau initial : ");
        afficher(donnees);

        System.out.println("Somme : " + somme(donnees));
   
        incre(donnees, 1.0);
        System.out.print("Après +1.0 : ");
        afficher(donnees);
     
        System.out.println("Nouvelle somme : " + somme(donnees));
    }
}