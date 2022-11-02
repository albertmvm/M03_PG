
package ex8;
import java.util.Scanner;

//

public class Ex8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Digues quants números vols introduir:");
        int repeat=sc.nextInt();
        System.out.println("Has d'introduir " + repeat + " número: ");
        
        while(i<repeat){
            System.out.println("Introdueix un número: ");
            int n=sc.nextInt();
            i++;
        }
        
        System.out.println("Gràcies per utilitzar aquest programa.");
    }

    
}
