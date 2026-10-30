import java.util.Scanner;
public class readInput{
public static void main (String[] args){
Scanner in= new Scanner (System.in);
System.out.print("Age?");
int age = in.nextInt();
System.out.print("you age : "+ age );

System.out.print("Name?");
String name = in.nextLine();

System.out.println("you name : "+ name );

in.close();

}
}
