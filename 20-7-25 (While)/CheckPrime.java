import java.util.Scanner;

class CheckPrime
{
public static void main(String...arg)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter a number : ");
int n=c.nextInt();

int i=2,cnt=0;
while(i<=n)
{
   if(n%i==0)
   {
      cnt++;
   }
  i++;
}

if(cnt==1)
{
System.out.print(n+" is prime number.");
}
else
{
System.out.print(n+" is not prime number.");
}

}
}