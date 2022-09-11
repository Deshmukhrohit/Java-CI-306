import java.util.Scanner;
public class FacultyTest
{
 public static void main(String [] args)
 { 
  Scanner s = new Scanner(System.in);
  System.out.println("Total no. of Faculties = "+Faculty.getCount());
  Faculty F1 = new Faculty();
  System.out.println("Enter name of first Faculty ");
  F1.setName(s.nextLine());
  System.out.println("Enter salary of first Faculty ");
  F1.setSalary(s.nextInt());
  System.out.println("First Faculty name = "+F1.getName()+ " and Salary = "+F1.getSalary());
  Faculty F2 = new Faculty();
  System.out.println("Enter name of second Faculty ");
  s.nextLine();
  F2.setName(s.nextLine());
  System.out.println("Enter salary of second Faculty ");
  F2.setSalary(s.nextInt());
  System.out.println("Second Faculty name = "+F2.getName()+ " and salary = "+F2.getSalary());
  System.out.println("Total no. of Facutlies = "+F1.getCount());
 }
}
