/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex3 {

    private static final String MSG_1 = ("Introdueix 3 nombres per teclat");
    private static final String MSG_2 = ("És més gran");
    private static final String MSG_3 = ("És més petit");

    public static void main(String[] args) {

        int num1, num2, num3, suma;

        System.out.println(MSG_1);

        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        suma = num1 + num2;

        System.out.println(MSG_2);


        if (num1 + num2 > num3) {
            System.out.println("La suma de los dos primeros numeros, es mayor que el tercero");
        } else {
            System.out.println("El tercer numero es mayor");
        }

    }

}
