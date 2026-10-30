import java.util.Scanner;
public class Countvowels{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String text = input.nextLine();

int vowels = 0;
int consonants = 0;

for (int i = 0; i < text.length(); i++) {

char ch = Character.toLowerCase(text.charAt(i));

if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

vowels++;

} else if (ch >= 'a' && ch <= 'z') {

consonants++;
}
}

System.out.println("4. Vowels = " + vowels);
System.out.println("4. Consonants = " + consonants);
}
}
}
