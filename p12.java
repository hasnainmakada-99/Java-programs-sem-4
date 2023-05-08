import java.util.*;
public class p12 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        
        for (int i = 0; i < 100; i++) {
            int randomInt = rand.nextInt(49) + 1;
            System.out.println(randomInt);
        }
    }
    
}
