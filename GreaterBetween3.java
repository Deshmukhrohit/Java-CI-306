import java.util.Scanner;
public class GreaterBetween3
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int a,b,c;
System.out.println("Enter any three number ");
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();
if(a>b && a>c)
System.out.println("Greater number = "+a);
else if(b>a && b>c)
System.out.println("Greater number = "+b);
else if(c>b && c>a)
System.out.println("Greater number = "+c);
else if(a==b && a>c)
System.out.println("a and b are equal and greater number = "+a);
else if(a==b && a<c)
System.out.println("Greater number = "+c);
else if(b==c && b>a)
System.out.println("b and c are equal and Greater number = "+b);
else if(b==c && b<a)
System.out.println("Greater number = "+a);
else if(a==c && b<c)
System.out.println("a and c are equal and Greater number = "+c);
else if(a==c && a<c)
System.out.println("Greater number = "+c);
else
System.out.println("All values are equal ");
}
}
