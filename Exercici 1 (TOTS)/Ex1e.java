/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacio.java;

import java.util.Scanner;

public class Ex1e {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number rows");
        int rows = sc.nextInt();

        if (rows <= 10) {

            for (int i = 1; i < rows; i++) {
                System.out.print(" ");

                //Para Espacios (_)
                for (int s = 0; s < (rows - i); s++) {
                    System.out.print("");
                }
                // Para los *
                for (int j = 0; j < (i * 2 - 1); j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {
            System.out.println("Please enter less than");
        }
    }
}
