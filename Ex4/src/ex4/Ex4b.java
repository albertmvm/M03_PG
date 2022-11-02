package ex4;

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

//b) Fer-ho amb l’estructura switch-case;

public class Ex4b {

    private static final String MSG_1 = " Introdueix un número per saber el més de l'any: ";
    private static final String MSG_2 = "Gener";
    private static final String MSG_3 = "Febrer";
    private static final String MSG_4 = "Març";
    private static final String MSG_5 = "Abril";
    private static final String MSG_6 = "Maig";
    private static final String MSG_7 = "Juny";
    private static final String MSG_8 = "Juliol";
    private static final String MSG_9 = "Agost";
    private static final String MSG_10 = "Sepetembre";
    private static final String MSG_11 = "Octubre";
    private static final String MSG_12 = "Novembre";
    private static final String MSG_13 = "Decembre";
    private static final String MSG_14 = " !!!ERROR!!! ";

    public static void main(String[] args) {
        int n;
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(MSG_2);
                break;
            case 2:
                System.out.println(MSG_3);
                break;
            case 3:
                System.out.println(MSG_4);
                break;
            case 4:
                System.out.println(MSG_5);
                break;
            case 5:
                System.out.println(MSG_6);
                break;
            case 6:
                System.out.println(MSG_7);
                break;
            case 7:
                System.out.println(MSG_8);
                break;
            case 8:
                System.out.println(MSG_9);
                break;
            case 9:
                System.out.println(MSG_10);
                break;
            case 10:
                System.out.println(MSG_11);
                break;
            case 11:
                System.out.println(MSG_12);
                break;
            case 12:
                System.out.println(MSG_13);
                break;
            default:
                System.out.println(MSG_14);
        }
    }
}
