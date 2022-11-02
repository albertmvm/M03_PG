package ex5;
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

//Exercici 5. Any de traspàs
//Donat un any qualsevol, el programa ha d’informar si és un any de traspàs o no. 

public class Ex5 {


    private static final String MSG_1 = " Introdueix un any: ";
    private static final String MSG_2 = " Aquest any ÉS de traspàs ";
    private static final String MSG_3 = " Aquest any NO és de traspàs ";
    
    public static void main(String[] args) {
        int n;
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if ((n%4==0)&&(n%100 != 0)||(n%400 == 0)){
            System.out.println(MSG_2);
        }else{
            System.out.println(MSG_3);
        }
    }   
}
