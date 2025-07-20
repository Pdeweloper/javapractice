import java.util.Scanner;

class CalSqrAndCube
{
public static void main(String...x)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number : ");
int n= s.nextInt();
int sqr=0,cub=0;

int i=1;
while(i<=n)
{
    int j=1;
    while(j<=n)
    {
       sqr++;
       j++;
    }
   i++;
}

i=1;
while(i<=n)
{
     int j1=1;
     while(j1<=n)
     {
         int k=1;
         while(k<=n)
         {
            cub++;
            k++;
         }
       j1++;
     }
   i++;
}

System.out.println("Square of "+n+" is : "+sqr);
System.out.println("Cube of "+n+" is : "+cub);

}
}