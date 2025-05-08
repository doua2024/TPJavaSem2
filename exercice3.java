import java.util.Scanner;

public class VerbeGroupe {

    // Vérifie si le mot est un infinitif connu
    public static boolean EstInf(String verbe) {
        return verbe.endsWith("er")
            || verbe.endsWith("ir")
            || verbe.endsWith("re")
            || verbe.endsWith("oir");
    }

    // Détermine le groupe du verbe
    public static int Groupe(String verbe) {
        // Aller est un cas particulier du 3e groupe
        if (verbe.equals("aller")) {
            return 3;
        }

        // 1er groupe : verbes en -er sauf "aller"
        if (verbe.endsWith("er")) {
            return 1;
        }

        // 2e groupe : verbes réguliers en -ir qui ont le participe présent en -issant
        // On simplifie ici avec une liste de quelques verbes connus du 2e groupe
        String[] deuxiemeGroupe = {
            "finir", "choisir", "grandir", "rougir", "applaudir", "réussir", "obéir", "punir"
        };
        for (String v : deuxiemeGroupe) {
            if (verbe.equals(v)) {
                return 2;
            }
        }

        // Tous les autres sont du 3e groupe
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Saisissez un verbe à l'infinitif : ");
            verbe = sc.next().toLowerCase();
            if (!EstInf(verbe)) {
                System.out.println("Erreur : ce n’est pas un infinitif. Réessayez.");
            }
        } while (!EstInf(verbe));

        int g = Groupe(verbe);
        switch (g) {
            case 1:
                System.out.println("Le verbe \"" + verbe + "\" est du 1er groupe.");
                break;
            case 2:
                System.out.println("Le verbe \"" + verbe + "\" est du 2e groupe.");
                break;
            default:
                System.out.println("Le verbe \"" + verbe + "\" est du 3e groupe.");
        }

        sc.close();
