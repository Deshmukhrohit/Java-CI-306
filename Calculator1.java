import java.util.Scanner;
public class Calculator1
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int n,ch,a,b;
do{
System.out.println("Enter 1 for addition ");
System.out.println("Enter 2 for subtraction ");
System.out.println("Enter 3 for multiplication ");
System.out.println("Enter 4 for Divide ");
System.out.println("Enter 5 for Modules ");
System.out.println("Enter 6 for exit ");
System.out.println("Enter any number ");
ch = s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
n=a+b;
System.out.println("Addition = "+n);
break;

case 2:
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
n=a-b;
System.out.println("Subtraction = "+n);
break;

case 3:
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
n=a*b;
System.out.println("Multiplication = "+n);
break;

case 4:
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
n=a/b;
System.out.println("Division = "+n);
break;

case 5:
System.out.println("Enter any two number ");
a = s.nextInt();
b = s.nextInt();
n=a%b;
System.out.println("Modules = "+n);
break;
 
case 6:
System.exit(0);

default:
System.out.println("Enter correct choice ");
}
}while(true);
}
}





