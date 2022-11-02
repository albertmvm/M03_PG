package implementacio.java.Ex3;

import java.util.Scanner;

//c) Determinar si un nombre és positiu i menor que 100.

public class Ex3c {

    private static final String MSG_1 = " Introdueix un numero dins del rang (1 < 100)";
    private static final String MSG_2 = " Aquest número és més gran que 100 i positiu";
    private static final String MSG_3 = " Aquest número no és més gran de 100 però és positiu";
    private static final String MSG_4 = " Aquest número no és més gran de 100 ni positiu";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num > 100) {
            System.out.println(MSG_2);
        } else {
            if (num > 0) {
                System.out.println(MSG_3);
            } else {
                System.out.println(MSG_4);
            }
        }
    }
}
