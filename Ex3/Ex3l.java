package ex3;

import java.util.Scanner;

//Nom: Albert 
//Cognoms: Martinez Ortega
//INS Manuel Vázquez Montalbán
//Data d’edició: 2/11/2022
//Nom del cicle formatiu: Adiministració de sistemes informàtics en xarxa
//Nom del mòdul: Programació M03
/**
 * ***********************************************************************************************
 */
//  l) Calcula la factura d’aigua tenint en compte les següents dades:
//  - La quota fixa és de 6€.
//  - Els primers 50 litres d’aigua són de franc.
//  - Entre 50 i 200 litres, el litre costa 0,1€
//  - A partir de 200 el litre costa 0,3€.

public class Ex3l {

    private static final String MSG_1 = " Introdueix els litres d'aigua utilitzats: ";
    private static final String MSG_2 = " La factura de l'aigua és de: ";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if ((num > 50) && (num < 200)) {
            System.out.println(MSG_2 + (6 + (num * 0.1 + "€")));
        } else {
            if (num < 50) {
                System.out.println(MSG_2 + 6 + "€");
            } else {
                System.out.println(MSG_2 + (6 + (num * 0.3 + "€")));
            }
        }
    }
}
