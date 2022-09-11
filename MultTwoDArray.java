import java.util.Scanner;
public class MultTwoDArray
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
int r,c;
System.out.println("Enter raw of matrix : ");
r = s.nextInt();
System.out.println("Enter coloumn of matrix : ");
c = s.nextInt();
int a[][] = new int[r][c];
int b[][] = new int[r][c];
int sum[][] = new int[r][c];
System.out.println("Enter elements of 1 Matrix : ");
for(int i=0;i<=r-1;i++)
{
 for(int j=0;j<=c-1;j++)
 {
  a[i][j]=s.nextInt();
 }
}
System.out.println("Enter elements of 2 Matrix : ");
for(int i=0;i<=r-1;i++)
{
 for(int j=0;j<=c-1;j++)
 {
  b[i][j]=s.nextInt();
 }
}
for(int i=0;i<=r-1;i++)
{
 for(int j=0;j<=c-1;j++)
 {
   sum[i][j]=0;
   for(int k=0;k<=r-1;k++)
   {
   sum[i][j]=sum[i][j]+a[i][k]*b[k][j];
   }
 }
}
System.out.println("Multiplication of matirx is : ");
for(int i=0;i<=r-1;i++)
{ 
 for(int j=0;j<=c-1;j++)
 {
  System.out.print(+sum[i][j]+" ");
 }
 System.out.println();
}
}
}
