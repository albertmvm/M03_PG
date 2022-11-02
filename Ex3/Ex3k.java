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
//k) Donats 2 nombres, mostreu si un d’ells és múltiple de l’altre. Suposa que primer es dóna el nombre més gran.

public class Ex3k {

    private static final String MSG_1 = " Introdueix dos números: ";
    private static final String MSG_2 = " El segon nombre no pot ser 0 , introdueix un altre: ";
    private static final String MSG_3 = " El primer nombre te que ser més gran que el segón introdueix un altre cop el primer número: ";
    private static final String MSG_4 = " El segón número és múltiple del primer. ";
    private static final String MSG_5 = " El segón número no és múltiple del primer. ";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        while (num2 == 0) {
            System.out.println(MSG_2);
            num2 = sc.nextInt();
        }
        while (num1 < num2) {
            System.out.println(MSG_3);
            num1 = sc.nextInt();
        }
        if (num1 % num2 == 0) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_5);
        }
    }
}
