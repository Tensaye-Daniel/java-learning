package Math_and_Random;

import java.util.Random;

public class DiceRollSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Simulating rolling two dice 10 times:");
        for (int i = 1; i <= 10; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            System.out.println("Roll " + i + ": (" + die1 + ", " + die2 + ") -> Sum = " + sum);
        }
    }
}
