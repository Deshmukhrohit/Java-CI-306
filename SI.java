import java.util.Scanner;
public class SI
{
public static void main(String [] args)
{
Scanner s =new Scanner(System.in);
int p,t,si,r;
System.out.println("Enter Principal amount ");
p = s.nextInt();
System.out.println("Enter radius of Interest ");
r = s.nextInt();
System.out.println("Enter time of Interest ");
t = s.nextInt();
si = (p*r*t)/100;
System.out.println("Simple Interest = "+si);
}
}
