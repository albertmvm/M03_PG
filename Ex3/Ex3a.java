package implementacio.java.Ex3;
import java.util.Scanner;

//Demanar un nombre, i determinar si es negatiu.
public class Ex3a {

    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);

        System.out.println("introdueix un nombre");
        num = n.nextInt();

        if (num < 0) {
            System.out.println("El nombre és negatiu");
        } else {
            System.out.println("El nombre és positiu");
        }
    }
}
