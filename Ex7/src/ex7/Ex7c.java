package ex7;
////Nom: Albert 
//Cognoms: Martinez Ortega
//INS Manuel Vázquez Montalbán
//Data d’edició: 2/11/2022
//Nom del cicle formatiu: Adiministració de sistemes informàtics en xarxa
//Nom del mòdul: Programació M03
/**
 * **********************************************************************************************
 */

//c) Escriure els 100 primers números parells començant pel 0.

public class Ex7c {

    public static void main(String[] args) {

        System.out.println("Apartat \"C\"");
        int i=0;
        while(i<101){
           if (i%2==0){
              System.out.println(i);  
           }
        i++; 
        }     
    }
}