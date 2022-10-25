/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;



public class HelloWorld {

    private static final String MSG_1 = "Introdueix la base: ";
    private static final String MSG_2 = "Introdueix l'altura: ";
    private static final String MSG_3 = "L'àrea del triangle es: ";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int base, height, area;
        System.out.println(MSG_1);
        base = sc.nextInt();
        System.out.println(MSG_2);
        height = sc.nextInt();
        area = base*height/2;
                
        System.out.println(MSG_3 + area);
    
    
    }
    
 
}
