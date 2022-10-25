package cat.institutmvm;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumne_1r
 */
public class Ex2 {
    
    private static final String MSG_1 = ("Introdueix un valor:");    
    private static final String MSG_2 = ("El doble és:");
    private static final String MSG_3 = ("El triple és:");

    public static void main(String[] args){
        
        //variables per guardar els valors
        int num, num_doble, num_triple;
        
        System.out.println(MSG_1);
        
        Scanner scan = new Scanner(System.in);//Escaner per llegir per teclat
        
        num = scan.nextInt();         

        num_doble = num*2;
        
        num_triple = num*3;
        
        System.out.println(MSG_2 + num + num_doble);
        System.out.println(MSG_3 + num + num_triple);           
    }           
 }
