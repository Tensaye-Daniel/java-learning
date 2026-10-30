import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ExerciseSolutions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice;

        do {
            System.out.println("\n================ EXERCISE (2) - JAVA SOLUTIONS ================");
            System.out.println("1. Odd, Even, Zero Digits (Read 5 integers)");
            System.out.println("2. Count > 50 (Read N integers)");
            System.out.println("3. Sum and Average (Read N integers)");
            System.out.println("4. Guessing Game (1 to 10)");
            System.out.println("5. Random 30-80 (Find Smallest of 5)");
            System.out.println("6. Random 1-50 (Find Largest Two of 5)");
            System.out.println("7. Count the 'a's in a String");
            System.out.println("8. Palindrome Check");
            System.out.println("0. Exit");
            System.out.print("Choose an exercise (0-8): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    exercise1(scanner);
                    break;
                case 2:
                    exercise2(scanner);
                    break;
                case 3:
                    exercise3(scanner);
                    break;
                case 4:
                    exercise4(scanner);
                    break;
                case 5:
                    exercise5(random);
                    break;
                case 6:
                    exercise6(random);
                    break;
                case 7:
                    exercise7(scanner);
                    break;
                case 8:
                    exercise8(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 0 and 8.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // 1. Odd, even, zero digits (Read 5 integers)
    public static void exercise1(Scanner scanner) {
        System.out.println("\n--- Exercise 1: Odd, Even, Zero Digits ---");
        int oddCount = 0, evenCount = 0, zeroCount = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Integer " + i + ": ");
            int num = scanner.nextInt();
            int temp = Math.abs(num);
            
            if (temp == 0) {
                zeroCount++;
            } else {
                while (temp > 0) {
                    int digit = temp % 10;
                    if (digit == 0) {
                        zeroCount++;
                    } else if (digit % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                    temp /= 10;
                }
            }
        }
        System.out.println("Digit counts -> Odd: " + oddCount + ", Even: " + evenCount + ", Zero: " + zeroCount);
    }

    // 2. Count > 50 (Read N integers)
    public static void exercise2(Scanner scanner) {
        System.out.println("\n--- Exercise 2: Count > 50 ---");
        System.out.print("Enter the number of integers (N): ");
        int n = scanner.nextInt();
        int count = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Integer " + i + ": ");
            int num = scanner.nextInt();
            if (num > 50) {
                count++;
            }
        }
        System.out.println("Number of integers strictly greater than 50: " + count);
    }

    // 3. Sum and average (Read N integers)
    public static void exercise3(Scanner scanner) {
        System.out.println("\n--- Exercise 3: Sum and Average ---");
        System.out.print("Enter the number of integers (N): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("N must be greater than 0.");
            return;
        }

        double sum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Integer " + i + ": ");
            sum += scanner.nextInt();
        }

        double average = sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    // 4. Guessing game (1 to 10)
    public static void exercise4(Scanner scanner) {
        System.out.println("\n--- Exercise 4: Guessing Game ---");
        Random rand = new Random();
        int target = rand.nextInt(10) + 1; // 1 to 10
        int attempts = 0;
        int guess;

        System.out.println("I have picked a number between 1 and 10. Try to guess it!");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess != target) {
                System.out.println("Wrong! Try again.");
            }
        } while (guess != target);

        System.out.println("Correct! You found the number in " + attempts + " attempt(s).");
    }

    // 5. Random 30-80 (5 random numbers, find the smallest)
    public static void exercise5(Random random) {
        System.out.println("\n--- Exercise 5: Random 30-80 (Find Smallest) ---");
        int[] numbers = new int[5];
        System.out.print("Generated numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(51) + 30; // 30 to 80 inclusive
            System.out.print(numbers[i] + (i < 4 ? ", " : ""));
        }
        System.out.println();

        int smallest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
    }

    // 6. Random 1-50 (5 random numbers, find the largest two)
    public static void exercise6(Random random) {
        System.out.println("\n--- Exercise 6: Random 1-50 (Find Largest Two) ---");
        int[] numbers = new int[5];
        System.out.print("Generated numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(50) + 1; // 1 to 50 inclusive
            System.out.print(numbers[i] + (i < 4 ? ", " : ""));
        }
        System.out.println();

        Arrays.sort(numbers);
        int largest1 = numbers[4];
        int largest2 = numbers[3];

        System.out.println("The largest two numbers are: " + largest1 + " and " + largest2);
    }

    // 7. Count the letter 'a' in a String
    public static void exercise7(Scanner scanner) {
        System.out.println("\n--- Exercise 7: Count the 'a's ---");
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a') {
                count++;
            }
        }
        System.out.println("The letter 'a' appears " + count + " time(s) in the string.");
    }

    // 8. Palindrome Check
    public static void exercise8(Scanner scanner) {
        System.out.println("\n--- Exercise 8: Palindrome Check ---");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }
    }
}
