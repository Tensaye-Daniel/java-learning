public class HELLO{
public static void main (String [] args){
int items= 4;
double price=2.50;
char size='M';
boolean isStudent=true;
double subTotal=items*price;
double tax=subTotal * 0.10;
double Total= subTotal+tax;
int min = 135;
int h= min/60;
int m = min % 60;
System.out.println("Size" + size);
System.out.println("Total " + Total);
System.out.println("Student " + isStudent);
System.out.println(h+"h" + m+"min");


}
}
