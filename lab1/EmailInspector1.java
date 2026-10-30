import java.util.Scanner;
public class EmailInspector1 {
public static void main (String[] args){
Scanner var1 = new Scanner(System.in);
System.out.print("Enter your Email: ");
      String email = var1.next();
int at = email.indexOf('@');
String user = email.substring(0, at);
String domain = email.substring(at+1);

System.out.println("User: " + user);
System.out.println("Domain: " + domain);
System.out.println("First: " + email.charAt(0));
String Newemail = email.substring(0, (email.length() - 3));

System.out.println("Is edu?: " + Newemail.endsWith(".edu"));
}}
