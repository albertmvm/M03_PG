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

//i) Calculeu el màxim de 2 nombres donats.

public class Ex3i {

    private static final String MSG_1 = " Introdueix dos numeros: ";
    private static final String MSG_2 = " El número més gran és: ";
    private static final String MSG_3 = " No hi ha màxim, els dos números són iguals. ";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num2 > num1) {
            System.out.println(MSG_2 + num2);
        } else {
            if (num2 == num1) {
                System.out.println(MSG_3);
            } else {
                System.out.println(MSG_2 + num1);
            }
        }
    }
}
