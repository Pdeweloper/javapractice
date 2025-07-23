import java.util.Scanner;

class Pattern3
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=97;i<=(97+(n-1));i++)
{
    for(int j=i;j<=(97+(n-1));j++)
    {
       System.out.print((char)j);
    }
  System.out.println();
}

}
}