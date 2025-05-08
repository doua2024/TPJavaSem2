
public class ex5 {

    
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double valeur : ligne) {
                System.out.print(valeur + "\t");
            }
            System.out.println();
        }
    }


    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int refLength = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != refLength) {
                return false;
            }
        }
        return true;
    }

    public static double[] sommesLignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (double val : t[i]) {
                sommes[i] += val;
            }
        }
        return sommes;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        
        if (!regulier(t1) || !regulier(t2) || 
            t1.length != t2.length || 
            t1[0].length != t2[0].length) {
            return null;
        }

        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
    
        double[][] tab1 = {{1.5, 2.5, 3.5}, {4.5, 5.5, 6.5}};
        double[][] tab2 = {{0.5, 1.5, 2.5}, {3.5, 4.5, 5.5}};
        double[][] tabIrregulier = {{1.0}, {2.0, 3.0}};

        System.out.println("=== Affichage ===");
        System.out.println("Tableau 1:");
        affiche(tab1);
        System.out.println("\nTableau 2:");
        affiche(tab2);

        System.out.println("\n=== Vérification régularité ===");
        System.out.println("Tab1 régulier? " + regulier(tab1));
        System.out.println("Tab irrégulier? " + regulier(tabIrregulier));

        System.out.println("\n=== Sommes des lignes ===");
        double[] sommes = sommesLignes(tab1);
        System.out.println("Sommes des lignes (Tab1):");
        for (double s : sommes) {
            System.out.print(s + " ");
        }

        System.out.println("\n\n=== Addition de tableaux ===");
        double[][] sommeTab = somme(tab1, tab2);
        if (sommeTab != null) {
            System.out.println("Résultat de l'addition:");
            affiche(sommeTab);
        } else {
            System.out.println("Addition impossible: tailles incompatibles");
        }

        System.out.println("\nTest avec tableau irrégulier:");
        double[][] testSomme = somme(tab1, tabIrregulier);
        if (testSomme == null) {
            System.out.println("Erreur: les tableaux ont des structures différentes");
        }
    }
}
