import java.util.Scanner;

public class exercice7 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;

        while (true) {
            System.out.print("Donnez un verbe régulier du premier groupe: ");
            verbe = scanner.nextLine().trim(); 

            if (verbe.isEmpty()) {
                System.out.println("Vous n'avez rien saisi. Veuillez entrer un verbe.");
                continue;
            }

            if (verbe.toLowerCase().equals("aller")) {
                System.out.println("Le verbe 'aller' est irrégulier.");
                continue;
            }

            if (verbe.toLowerCase().endsWith("er")) {
                break;
            } else {
                System.out.println("** ne se termine pas par er - donnez un verbe régulier du premier groupe:");
            }
        }

        conjuguer(verbe);
    }

    public static void conjuguer(String verbe) {
        String radical = verbe.substring(0, verbe.length() - 2); 
        System.out.println("je " + radical + "e");
        System.out.println("tu " + radical + "es");
        System.out.println("il/elle " + radical + "e");
        
        // Condition spécifique pour les verbes comme "manger"
        if (verbe.endsWith("ger")) {
            System.out.println("nous " + radical + "eons");
        } else {
            System.out.println("nous " + radical + "ons");
        }
        
        System.out.println("vous " + radical + "ez");
        System.out.println("ils/elles " + radical + "ent");
    }
}