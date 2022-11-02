package implementacio.java.Ex3;

import java.util.Scanner;

//e) Determinar si un nombre no pertany al interval [25,50].
public class Ex3e {

    private static final String MSG_1 = " Introdueix un valor dins del rang demanat: ";
    private static final String MSG_2 = " Aquest número pertany a l'interval [25 , 50] ";
    private static final String MSG_3 = " Aquest número no pertany a l'interval [25 , 50] ";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
        num = sc.nextInt();
        if ((num >= 25) && (num <= 50)) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
        sc.close();
    }
}
