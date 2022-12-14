package cat.institutmvm;

import java.util.Scanner;

public class Ex1new {

    private static final String MSG_1 = "Ingresa un numero: ";

    public static void main(String[] args) {
        int num;
        Ex1new lectura = new Ex1new();
        num = lectura.metodo();

        if (num < 0) {
            System.out.println("Es negatiu");
        } else if (num >= 0) {
            System.out.println("Es positiu");
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

