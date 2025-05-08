
public class ex6 {
  
    public static int maxTableau(int[] tableau) {
      
        if (tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Erreur : Le tableau ne peut pas être vide");
        }
      
        int max = tableau[0];
        
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];  
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
       
        int[] nombres = {12, 45, 9, 27, 6, 34};
        
        try {
         
            System.out.println("Contenu du tableau :");
            for (int num : nombres) {
                System.out.print(num + " ");
            }
            
            System.out.println("\n\nLe maximum est : " + maxTableau(nombres));
            
            
        } catch (IllegalArgumentException e) {
            System.err.println("\nErreur : " + e.getMessage());
        }
    }
}
