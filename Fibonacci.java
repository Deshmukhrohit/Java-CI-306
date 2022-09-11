import java.util.Scanner;
public class Fibonacci
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int nterm,a=0,b=1,c=0;
System.out.println("Enter term of Fibonacci Series ");
nterm = s.nextInt();
if(nterm==0)
{
System.out.println("0");
}
else if(nterm==1)
{
System.out.println("1");
}
else
{
for(int i=1;i<=nterm-2;i++)
{
c=a+b;
a=b;
b=c;
}
System.out.println("Term of Fibonacci Series = "+c);
}
}
}

