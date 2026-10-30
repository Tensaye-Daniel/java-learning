public class NameBadge {
	public static void main (String[] args) {
	String first = "Ada";
	String last = "Lovelace";
	String full = first + " " + last;
	System.out.println("Name: " + full);
System.out.println("Length: " + full.length());
System.out.println("Upper: " + full.toUpperCase());
System.out.println("Lower: " + full.toLowerCase());
String login = first.toLowerCase() + "." + last.toLowerCase();
System.out.println("Login: " + login);
}
}
