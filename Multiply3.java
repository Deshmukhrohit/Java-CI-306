import java.util.Scanner;
public class Multiply3
{
public static void main(String [] args)
{
Scanner s= new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter any three number");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=a*b*c;
System.out.println("Multiplication of three number = "+d);
}
}
