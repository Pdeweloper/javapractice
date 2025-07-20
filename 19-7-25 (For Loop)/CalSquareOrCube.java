import java.util.Scanner;

class CalSquareOrCube
{
public static void main(String...x)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter Your Number : ");
int n = s.nextInt();

int sqr=0;
int cub=0;

for(int i=1;i<=n;i++)
{
   for(int j=1;j<=n;j++)
   {
      sqr++;
   }
}

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n;j++)
    {
       for(int k=1;k<=n;k++)
       {
           cub++;
       }
    }
}

System.out.println("Square of "+n+" is : "+sqr);
System.out.print("Cube of "+n+" is : "+cub);


}
}