package UF2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */

public class ex12 {
     public static void main(String[] args) {
        
        // Genera un nombre aleatori entre 0 i 1000
        Random num = new Random();
        int number = num.nextInt(1000);
        
        // Crear un escàner per a l'entrada de l'usuari
        Scanner sc = new Scanner(System.in);

        // Permet a l'usuari 3 intents d'endevinar el número
        for (int i = 0; i < 3; i++) {
            System.out.print("Endevína el número: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("CORRECTE!! has endivinat el número!!!!");
                return;
            } else {
                System.out.println("ERROR, Aquest no es el número. Torna a probar!");
            }
        }
        System.out.println("OHHHH HAS PERDUT... El número era: " + number);
    }
}
