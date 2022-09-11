import java.util.Scanner;
public class Factorial
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int flag=1,n;
System.out.println("Enter any number ");
n = s.nextInt();
for(int i=n;i>=1;i--)
{
flag=flag*i;
}
System.out.println("Factorial of number = "+flag);
}
}
