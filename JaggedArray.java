import java.util.Scanner;
public class JaggedArray
{
 public static void main(String [] args)
 {
  Scanner s = new Scanner(System.in);
  int a[][] = new int [3][];
  a[0] = new int [1];
  a[1] = new int [2];
  a[2] = new int [4];
  a[2] = {33 , 44 , 55 , 66 };
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<=i;j++)
   {
    a[i][j] = s.nextInt();
   }
  }
System.out.println("Element of Jagged array ");
for(int i=0;i<2;i++)
  {
   for(int j=0;j<=i;j++)
   {
   System.out.print(a[i][j]+"\t");
   }
  System.out.println();
  }
}
}
