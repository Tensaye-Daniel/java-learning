import java.util.Scanner;

public class RepeatSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        
        // Consume the leftover newline character left by nextInt()
        scanner.nextLine(); 

        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println(sentence);
        }
        scanner.close();
    }
}
