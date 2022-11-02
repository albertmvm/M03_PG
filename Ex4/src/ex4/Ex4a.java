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
//(A partir d’un nombre comprès entre 1 i 12, el programa cal que retorni el nom del mes. En cas de que el nombre no es trobi entre 1 i 12 cal que mostri un missatge d’error).
//Fer-ho amb if/else

public class Ex4a {

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
        if (n == 1) {
            System.out.println(MSG_2);
        }
        if (n == 2) {
            System.out.println(MSG_3);
        }
        if (n == 3) {
            System.out.println(MSG_4);
        }
        if (n == 4) {
            System.out.println(MSG_5);
        }
        if (n == 5) {
            System.out.println(MSG_6);
        }
        if (n == 6) {
            System.out.println(MSG_7);
        }
        if (n == 7) {
            System.out.println(MSG_8);
        }
        if (n == 8) {
            System.out.println(MSG_9);
        }
        if (n == 9) {
            System.out.println(MSG_10);
        }
        if (n == 10) {
            System.out.println(MSG_11);
        }
        if (n == 11) {
            System.out.println(MSG_12);
        }
        if (n == 12) {
            System.out.println(MSG_13);
        }
        if ((n <= 0) || (n > 12)) {
            System.out.println(MSG_14);
        }
    }
}
