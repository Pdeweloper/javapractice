import java.util.Scanner;

class Pattern4
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=1;i<=n-1;i++)
{
    for(int j=i;j<=n;j++)
    {
       if(j==n)
       System.out.print(n-i);
       else
       System.out.print("1 ");

    }
  System.out.println();
}
 System.out.print("1 ");


}
}