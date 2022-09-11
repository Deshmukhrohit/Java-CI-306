import java.util.Scanner;
public class BoxTesterMain
{
public static void main(String []args)
{
Scanner s = new Scanner(System.in);
Box b1 = new Box();
System.out.println(b1);
Box b2 = new Box(5,10,15);
System.out.println(b2);
Box b3 = new Box(b1);
System.out.println(b3);
Box b4 = new Box(5,10);
System.out.println(b4);
Box b5 = new Box(5);
System.out.println(b5);
System.out.println("Enter first integer of BoX");
b1.setA(s.nextInt());
System.out.println("Enter second integer of BoX");
b1.setB(s.nextInt());
System.out.println("Enter Third integer of BoX");
b1.setC(s.nextInt());
System.out.println("Print Dimension of all Boxes BOX1 :- "+b1);
System.out.println("BOX2 :- "+b2+ "\nBOX3 :- "+b3+ "\nBOX4 :- "+b4+ " \n and BOX5 :- "+b5);
b1.volume();
b5.volume();
System.out.println("Volume of Cuboid = "+b1.getVolume());
System.out.println("Volume of Cube = "+b5.getVolume());
}
}
