class FibonacciSeries
{
public static void main(String...args)
{
int n=10;
int a=0,b=1,c;
System.out.print(a+" "+b+" ");

for(int i=2;i<n;i++)
{
    c=a+b;
    a=b;
    b=c;
  System.out.print(c+" ");
}

System.out.println();

a=0;b=1;c=0;

for(int i=2;i<n;i++)
{
    c=a+b;
    a=b;
    b=c;

   int cnt=0;

   for(int j=1;j<=c;j++)
   {
      if(c%j==0)
      {
        cnt++;
      }
      
   }
  
   if(cnt==2)
  System.out.print(c+" ");
}

}
}