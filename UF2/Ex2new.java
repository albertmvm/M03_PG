package cat.institutmvm;

import java.util.Scanner;

public class Ex2new {

    private static final String MSG_1 = "Introdueix un numero:";

    public static void main(String[] args) {
        int num;
        Ex2new lectura = new Ex2new();
        num = lectura.metodo();

        if (num < 100) {
            System.out.println("Es positiu i menor que 100");
        }
    }

    public int metodo() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();

        return num;
    }
}
