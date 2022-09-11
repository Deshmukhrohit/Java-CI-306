import java.util.Scanner;
public class MultOneDArray
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int n = s.nextInt();
int a[] = new int[n];
long sum=1;
System.out.println("Enter the Elements of array : ");
for(int i=0;i<=n-1;i++)
{
    a[i] = s.nextInt();
}
for(int i=0;i<=n-1;i++)
{
if((i+1)%2==0)
{
if(a[i]%2!=0 && a[i]>35)
{
sum=sum*a[i];
}
}
}
System.out.println("Sum of array is : "+sum);
}
}
