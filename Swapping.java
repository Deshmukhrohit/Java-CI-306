import java.util.Scanner;
public class Swapping
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int a,b,c;
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
c=a;
a=b;
b=c;
System.out.println("Swapping of two number is a = "+a+" and b = "+b );
}
}
