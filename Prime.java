import java.util.Scanner;
public class Prime
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int n,flag=0;
System.out.println("Enter any number ");
n = s.nextInt();
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}

if(flag==1)
{
System.out.println(n+ " is not Prime number. ");
}
else
{
System.out.println(n+ " is Prime number. ");
}
}
}



