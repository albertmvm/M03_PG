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

//f) Determinar si el mòdul d'un nombre (num1) entre un altre nombre (num2) és menor que 15. No pots fer servir la funció valor absolut i tots dos valors s’introdueixen per teclat.

public class Ex3f {

    private static final String MSG_1 = " Introdueix dos números: ";
    private static final String MSG_2 = " El mòdul del  primer nombre entre el segon és més petit de 15 \"mòdul dels nombres\" : ";
    private static final String MSG_3 = " El mòdul del  primer nombre entre el segon és més gran que 15 (mòdul dels nombres) : ";
    private static final String MSG_4 = " El segon nombre no pot ser 0 introdueix un altre ";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        while(0==num2){
            System.out.println(MSG_4);
            num2 = sc.nextInt();
        }
        if (num1 % num2 < 15){
            System.out.println(MSG_2 + (num1 % num2));
        } else{
            System.out.println(MSG_3 + (num1 % num2));
        }
    }

}
