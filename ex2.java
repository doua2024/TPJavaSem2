
public class ex2 {
    private final double[] composantes;  

    public Vecteur(double[] valeurs) {
        this.composantes = valeurs.clone();  
    }

    public double produitScalaire(Vecteur autre) {
        if (autre == null || autre.composantes.length != this.composantes.length) {
            throw new IllegalArgumentException("Vecteurs de tailles différentes");
        }
        
        double resultat = 0.0;
        for (int i = 0; i < composantes.length; i++) {
            resultat += composantes[i] * autre.composantes[i];
        }
        return resultat;
    }
    public void afficher() {
        System.out.print("(");
        for (int i = 0; i < composantes.length; i++) {
            System.out.print(composantes[i]);
            if (i < composantes.length - 1) System.out.print(", ");
        }
        System.out.println(")");
    }
    
  
    public static Vecteur somme(Vecteur v1, Vecteur v2) {
        if (!sontCompatibles(v1, v2)) return null;
        
        double[] resultat = new double[v1.composantes.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = v1.composantes[i] + v2.composantes[i];
        }
        return new Vecteur(resultat);
    }

    public static Vecteur produit(Vecteur v1, Vecteur v2) {
        if (!sontCompatibles(v1, v2)) return null;
        
        double[] resultat = new double[v1.composantes.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = v1.composantes[i] * v2.composantes[i];
        }
        return new Vecteur(resultat);
    }
    
   
    private static boolean sontCompatibles(Vecteur v1, Vecteur v2) {
        return v1 != null && v2 != null 
               && v1.composantes.length == v2.composantes.length;
    }
    
 
    public static void main(String[] args) {

        Vecteur v1 = new Vecteur(new double[]{1.0, 2.0, 3.0});
        Vecteur v2 = new Vecteur(new double[]{4.0, 5.0, 6.0});

        System.out.print("Vecteur 1: ");
        v1.afficher();
        System.out.print("Vecteur 2: ");
        v2.afficher();
       
        System.out.println("\n=== Opérations ===");
        
        Vecteur somme = Vecteur.somme(v1, v2);
        System.out.print("Somme: ");
        if (somme != null) somme.afficher();
        else System.out.println("Opération impossible");
        
        Vecteur produit = Vecteur.produit(v1, v2);
        System.out.print("Produit: ");
        if (produit != null) produit.afficher();
        else System.out.println("Opération impossible");
        
        try {
            System.out.println("Produit scalaire: " + v1.produitScalaire(v2));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur produit scalaire: " + e.getMessage());
        }
    }
}