class PrimeNumCheck
{
public static void main(String...arg)
{
int n = 4;
int cnt=0;

for(int i=2;i<=n;i++)
{
   if(n%i==0)
   {
      cnt++;
   }
}

if(cnt==1)
{
System.out.print(n+" is Prime number");
}
else
{
System.out.print(n+" is not Prime number");
}

}
}