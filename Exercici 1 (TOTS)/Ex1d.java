/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacio.java;
import java.util.Scanner;

public class Ex1d {
    
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("Inserta número d'asteriscos:");
        int costat = tecla.nextInt();
        
        for(int i=1;i<=costat;i++) {
            for(int j=1;j<=costat;j++) {
                System.out.print("*");
           }
          System.out.println();
        }
    }
}
