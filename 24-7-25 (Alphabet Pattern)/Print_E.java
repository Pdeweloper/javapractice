class Print_E
{
public static void main(String...x)
{

for(int i=1;i<=5;i++)
{
   for(int j=1;j<=5;j++)
   {
       if(i%2!=0)
       {
          System.out.print("*");
       }
       else
       {
          if(j==1)
          System.out.print("*");
          else
         System.out.print(" ");
       }
   }
  System.out.println();
}

}
}