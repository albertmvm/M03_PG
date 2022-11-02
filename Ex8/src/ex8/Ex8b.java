package ex8;

import java.util.Scanner;

////Nom: Albert 
//Cognoms: Martinez Ortega
//INS Manuel Vázquez Montalbán
//Data d’edició: 2/11/2022
//Nom del cicle formatiu: Adiministració de sistemes informàtics en xarxa
//Nom del mòdul: Programació M03
/**
 * **********************************************************************************************
 */

//b) Demanar números enters a l’usuari però fer que el primer número a demanar sigui el nombre de números que demanarà. 

public class Ex8b {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Digues quants números vols introduir:");
        int repeat=sc.nextInt();
        System.out.println("Has d'introduir " + repeat + " número: ");
        
        while(i<repeat){
            System.out.println("Introdueix un número: ");
            int n=sc.nextInt();
            i++;
        }
        
        System.out.println("Gràcies per utilitzar aquest programa.");
    }
}
