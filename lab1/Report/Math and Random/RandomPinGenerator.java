package Math_and_Random;

import java.util.Random;

public class RandomPinGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        // Generates an integer in the range [1000, 9999]
        int pin = random.nextInt(9000) + 1000;
        
        System.out.println("Generated 4-digit PIN: " + pin);
    }
}
