package implementacio.java.Ex3;

import java.util.Scanner;

//d)Determinar si un nombre per pertany a l'interval [-3,27].

public class Ex3d {

    private static final String MSG_1 = " Introdueix un valor dins del rang demanat: ";
    private static final String MSG_2 = " Aquest número pertany a l'interval [-3 , 27] ";
    private static final String MSG_3 = " Aquest número no pertany a l'interval [-3 , 27] ";

    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        if((num>=-3)&&(num<=27)){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}
