import java.util.Scanner;

class TablePrint
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=1;i<=n;i++)
{
   for(int j=1;j<=10;j++)
   {
       System.out.println(i+"*"+j+"="+(i*j));
   }
  System.out.println();
}

}
}