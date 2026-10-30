import java.util.Random;
public class DieAverageSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int totalSum = 0;
        int rolls = 1000;
        
        for (int i = 0; i < rolls; i++) {
            int roll = random.nextInt(6) + 1;
            totalSum += roll;
        }
        
        double average = (double) totalSum / rolls;
        double difference = Math.abs(average - 3.5);
        
        System.out.println("Average of " + rolls + " rolls: " + average);
        System.out.println("Theoretical expected value: 3.5");
        System.out.println("Difference from 3.5: " + difference);
    }
}
