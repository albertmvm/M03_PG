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

//g) Determinar si un enter és senar (ho serà quan el residu de la seva divisió per 2 sigui diferent de zero).

public class Ex3g {

    private static final String MSG_1 = " Introdueix un número: ";
    private static final String MSG_2 = " Aquest número enter és sennar!!!! ";
    private static final String MSG_3 = " XXXX Aquest número enter no és sennar XXXX ";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
        sc.close();
    }
}
