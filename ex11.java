package UF2;

import java.util.Random;

/**
 *
 * @author alumne_1r
 */

public class ex11 {
    
    
    public static int RandomNumber() {
        Random num = new Random();
        return num.nextInt(257);
    }

    public static void main(String[] args) {
        int num = RandomNumber();
        System.out.println(num);
    }
}
