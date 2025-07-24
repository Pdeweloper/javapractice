class Print_A
{
public static void main(String...x)
{
int n=5;
int i;
for(i=1;i<=n;i++)
{
    for(int j=n-i;j>=1;j--)
    {
       System.out.print(" ");
    }
    int cnt=0;
    for(int k=1;k<=i;k++)
    {
        if(k==1)
        System.out.print("*");
        
        if(cnt==0)
        {  for(int l=1;l<=i-1;l++)
          { if(i==3)
           System.out.print("*");
           else
           System.out.print(" ");
          }
        }

        if(k==i)
        { 
          for(int l=1;l<=i-1;l++)
          { 
           if(i==3)
           System.out.print("*");
           else
           System.out.print(" ");
          }
          System.out.print("*");
        }
        
       cnt++;
    }
  System.out.println();
}

}
}

 /*for(int l=1;l<=i-1;l++)
        {
           System.out.print(" ");
        }
*/