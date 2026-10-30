import java.util.Scanner;r

public class Reverse{
    public static void main(String[] argu){
        Scanner input = new Scanner(System.in);
 System.out.print("\nEnter an integer to reverse: ");

int number = input.nextInt();
int reverse = 0;

while (number != 0) {

int digit = number % 10;

reverse = reverse * 10 + digit;

number = number / 10;
}

System.out.println("3. Reversed = " + reverse);08:45
    }
}
