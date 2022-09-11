import java.util.Scanner;
public class DigitsSum
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int n,q,ans=0;
System.out.println("Enter any number ");
n = s.nextInt();
while(n!=0)
{
q=n%10;
ans=ans+q;
n=n/10;
}
System.out.println("Sum of Digits = "+ans);
}
}
