import java.util.Scanner;
public class AreaOfCircle
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int r;
double a;
System.out.println("Enter radius of Circle ");
r = s.nextInt();
a = 3.14159*r*r;
System.out.println("Area of Circle = "+a);
}
}
