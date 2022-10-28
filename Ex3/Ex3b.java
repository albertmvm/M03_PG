package implementacio.java.Ex3;
import java.util.Scanner;


public class Ex3b {
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);

        System.out.println("introdueix un nombre");
        num = n.nextInt();

        if (num > 35) {
            System.out.println("El nombre és + gran que 35!!!!");
        } else {
            System.out.println("El nombre és - petit de 35");
        }
    }
}
