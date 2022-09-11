import java.util.Scanner;
public class EmployeeTester
{
public static void main(String [] args)
{
 Scanner s = new Scanner(System.in);
 Employee e = new Employee();
 Employee e1 = new Employee();
System.out.println("Enter name of 1 Employee ");
e.setName(s.nextLine());
System.out.println("Enter Designation of 1 Employee ");
e.setDesignation(s.nextLine());
System.out.println("Enter Salary of 1 Employee ");
e.setSalary(s.nextInt());
System.out.println("Enter name of 2 Employee ");
s.nextLine();
e1.setName(s.nextLine());
System.out.println("Enter Designation of 2 Employee ");
e1.setDesignation(s.nextLine());
System.out.println("Enter Salary of 2 Employee ");
e1.setSalary(s.nextInt());
System.out.println("1 Employee Name = "+e.getName());
System.out.println("1 Employee Designation = "+e.getDesignation());
System.out.println("1 Employee Salary = "+e.getSalary());
System.out.println("2 Employee Name = "+e1.getName());
System.out.println("2 Employee Designation = "+e1.getDesignation());
System.out.println("2 Employee Salary = "+e1.getSalary());
}
}

