import java.util.Scanner;

public class GreetingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        int age = 2026 - birthYear;
        System.out.println("Hello " + name + ", you are about " + age + " years old.");
        scanner.close();
    }
}
