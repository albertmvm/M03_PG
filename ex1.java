package UF2;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ex1 {
     public static void main(String[] args) {
        // Crear un escàner per a l'entrada de l'usuari
        Scanner sc = new Scanner(System.in);

        // Demana un número a l'usuari
        System.out.print("Introdueix un nombre: ");
        int number = sc.nextInt();

        // Comprova si el nombre és negatiu
        if (number < 0) {
            System.out.println("El número " + number + " és Negatiu!!.");
        } else {
            System.out.println("El número " + number + " NO ES NEGATIU.");
        }
    }
}
   
