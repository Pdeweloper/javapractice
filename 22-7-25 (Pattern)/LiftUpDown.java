import java.util.Scanner;

class LiftUpDown
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter Hours : ");
float hr=c.nextFloat();

int n =(int)hr*10;

for(int i=1;i<=n;i++)
{
    System.out.println("Cycle "+i);

    System.out.print("UP : ");
    for(int j=1;j<=5;j++)
    {
        System.out.print(j+" ");
    }
  System.out.println();
    System.out.print("DOWN : ");
    for(int k=5;k>=1;k--)
    {
        System.out.print(k+" ");
    }
  System.out.println();
  System.out.println();

}

System.out.println("Total Cycle Done in "+hr+"hr is : "+n);

}
}