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

//j) Calculeu el màxim de tres nombres.

public class Ex3j {
 
    private static final String MSG_1 = " Introdueix tres números: "; 
    private static final String MSG_2 = " El número més gran és: ";
    private static final String MSG_3 = " No hi ha màxim, els tres números són iguals. ";
    
    public static void main(String[] args) {

        System.out.println(MSG_1);
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if ((num1>num2)&&(num1>num3)){
            System.out.println(MSG_2+num1);
        }else{
            if (num2<num3){
                System.out.println(MSG_2+num3);
            }else{
                if((num1==num2)&&(num1==num3)){
                    System.out.println(MSG_3);
                }else{
                    System.out.println(MSG_2+num2);
                }  
            }  
        }        
    }
}
