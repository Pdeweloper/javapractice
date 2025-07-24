class Pattern7
{
public static void main(String...x)
{
int n=5;
int a,b;

for(int i=1;i<=n;i++)
{   
    a=1;b=2;
    for(int j=1;j<=6-i;j++)
    {   

        if(i==1&&j==n)
        {
           System.out.print("1");
        }
        else if(i%2!=0)
        {
            if(j%2!=0)
            {
               System.out.print(a);
               a=2;
            }
            else
            {
               System.out.print(b);
               b=1;
            }

        }
        else
        {
            if(j%2!=0)
            {
               System.out.print(a);
            }
            else
            {
               System.out.print(b);
            }

        }
    }
   System.out.println();
}


}
}