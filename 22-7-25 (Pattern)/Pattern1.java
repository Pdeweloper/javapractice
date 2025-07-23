import java.util.Scanner;

class Pattern1
{
public static void main(String...arg)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=65;i<=(65+(n-1));i++)
{
    for(int j=65;j<=(65+(n-1));j++)
    {
        if(i>j)
        System.out.print(" ");
        else
        System.out.print((char)j);
    }
  System.out.println();
}

}
}