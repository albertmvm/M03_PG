package cat.institutmvm;
import java.util.Scanner;

public class UF2 {
       
        
        public static void main(String[] args) {
            int num;
        }
        
        
        public void helloWorld(){
            System.out.println("Hello World!");
    
        }
        
        public void helloWorld(String name){   
            System.out.println("Benvolgut Albert");
         
        }    

        public int validaNatural(){
            int num;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Introdueix un valor més gran que 1");
                num = sc.nextInt();
                
            }while(num<1);
            
            return num;
    }
}
