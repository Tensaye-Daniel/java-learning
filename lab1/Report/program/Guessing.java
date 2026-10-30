import java.util.Scanner;

public class Guessing {

    // Helper method to determine letter grade
    public static char getLetterGrade(double score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of scores (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number of scores.");
            return;
        }

        double[] scores = new double[n];
        double sum = 0;

        System.out.println("\nEnter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score #" + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }

        double highest = scores[0];
        double lowest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        double average = sum / n;

        System.out.println("\n--- Grade Book Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Score #%d: %.2f | Grade: %c%n", (i + 1), scores[i], getLetterGrade(scores[i]));
        }

        System.out.println("--------------------------");
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Highest Score: %.2f%n", highest);
        System.out.printf("Lowest Score:  %.2f%n", lowest);

        scanner.close();
    }
}
