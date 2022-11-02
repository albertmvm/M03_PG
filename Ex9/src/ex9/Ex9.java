package ex9;
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

//Ex9. Calcula la mitjana aritmètica d’un seguit de nombres que introduirà l’usuari (fins que l’usuari introdueixi un 0).

public class Ex9 {

    private static final String MSG_1 = " Introdueix un seguit de nombres, per no introduir més posa un 0 "; 
    private static final String MSG_2 = " La mitjana dels nombres és: "; 
    
    public static void main(String[] args) {
        int n;
        int suma = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do{
            n = sc.nextInt();
            suma += n;
            count++;    
        }while(n!=0);
        System.out.println(MSG_2+(suma/(count-1)));
    }
}
