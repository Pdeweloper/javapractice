class Pattern2
{
public static void main(String...x)
{
int n=5;

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=(n+1)-i;j++)
    {
        if(j==2||j==3||j==5)
        System.out.print("0 ");
        else
        System.out.print("1 ");
    }
  System.out.println();
}

}
}