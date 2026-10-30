package Math_and_Random;

import java.util.*;

public class SquareCubeRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
    
        System.out.println("Square Root: " + Math.sqrt(num));
        System.out.println("Cube (Math.pow): " + Math.pow(num, 3));
        System.out.println("Rounded Value: " + Math.round(num));
        
        scanner.close();
    }
}
