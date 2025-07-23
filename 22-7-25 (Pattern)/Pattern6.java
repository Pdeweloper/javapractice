import java.util.Scanner;

class Pattern6
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=1;i<=n;i++)
{
   for(int s=1;s<=i-1;s++)
   {
      System.out.print(" ");
   }

   for(int j=1;j<=(n+1)-i;j++)
   {
      System.out.print(j);
   }
 System.out.println();
}

}
}