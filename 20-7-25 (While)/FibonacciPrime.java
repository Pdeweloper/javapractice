class FibonacciPrime
{
public static void main(String...arg)
{
int n=15;
int a=0,b=1,c;

System.out.print("Actual Fibonacci : ");
System.out.print(a+" "+b+" ");
int i=2;
while(i<=n)
{
   c=a+b;
   a=b;
   b=c;
   System.out.print(c+" ");
  i++;
}

System.out.println();
System.out.print("Prime Fibonacci : ");
a=0;b=1;c=0;
i=2;
while(i<=n)
{
   c=a+b;
   a=b;
   b=c;

   int cnt=0,j=2;
   while(j<=c)
   {
      if(c%j==0)
      {
         cnt++;
      }
     j++;
   }
 
   if(cnt==1)
   {
     System.out.print(c+" ");
   }
 i++;
}

}
}