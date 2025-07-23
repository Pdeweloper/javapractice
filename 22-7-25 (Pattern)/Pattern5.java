import java.util.Scanner;

class Pattern5
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=1;i<=n;i++)
{    
     for(int s=1;s<=(n-i);s++)
    {
        System.out.print(" ");
    }
  
     for(int j=1;j<=(2*i)-1;j++)
    {
        System.out.print("*");
    }
  System.out.println();
}

}
}