import java.util.Scanner;

class SeriesOfPrimeNum
{
public static void main(String...x)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter number of row : ");
int n=c.nextInt();

for(int i=1;i<=n;i++)
{  
    int cnt=0;
    for(int j=2;j<=n;j++)
    {
         if(i%j==0)
         {
            cnt++; 
         }
    }
    if(cnt==1)
    System.out.print(i+" ");
}

}
}

//----------------------------------------------------------------------------------

//Without third variable.
class SeriesOfPrimeNum2
{
public static void main(String...x)
{
int n=50;
int i,j;
for(i=1;i<=n;i++)
{
   for(j=2;j<=i;j++)
   {
         if(i%j==0)
         break;
   }
   if(i==j)
   System.out.print(i+" ");
}

}
}