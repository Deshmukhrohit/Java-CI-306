import java.util.Scanner;
public class PrintTester
{
 public static void main(String [] args)
 {
  PrintTest p = new PrintTest();
  Scanner s = new Scanner(System.in);
  int a;
  String b;
  Double c;
  System.out.println("Enter the integer value ");
  a = s.nextInt();
  p.setA(a);
  System.out.println("Enter the String value ");
  s.nextLine();
  b = s.nextLine();
  p.setB(b);
  System.out.println("Enter the Double value ");
  c = s.nextDouble();
  p.setC(c);
 System.out.println("Value of integer variable = "+p.getA());
 System.out.println("Value of String variable = "+p.getB());
 System.out.println("Value of double variable = "+p.getC());
 System.out.println("Value of object class = "+p);
 }
}
