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
public class ExRaquel {
    
    private static final String MSG_1 = "Introdueix dos nombres per teclat";
    private static final String MSG_2 = "El resultat de la divisió és";
    private static final String MSG_3 = "ERROR";      
            
    public static void main(String[] args){
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        n1= sc.nextInt();
        n2= sc.nextInt();
        while(n2==0){
            System.out.println(MSG_3);
        }
        System.out.println(MSG_2 + (n1/n2));
    }
}
