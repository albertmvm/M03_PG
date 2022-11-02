package ex3;

import java.util.Scanner;

//Nom: Albert 
//Cognoms: Martinez Ortega
//INS Manuel Vázquez Montalbán
//Data d’edició: 2/11/2022
//Nom del cicle formatiu: Adiministració de sistemes informàtics en xarxa
//Nom del mòdul: Programació M03
/**
 * **********************************************************************************************
 */

//h) Elevi al quadrat un nombre si és parell i al cub si és senar.

public class Ex3h {

    private static final String MSG_1 = " Introdueix un número: ";
    private static final String MSG_2 = " Aquest número és parell, l'elevem al quadrat: ";
    private static final String MSG_3 = " Aquest número és sennar, l'elevem al cub: ";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(MSG_2 + (num * num));
        } else {
            System.out.println(MSG_3 + (num * num * num));
        }
    }
}
