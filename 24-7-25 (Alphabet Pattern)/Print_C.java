class Print_C
{
public static void main(String...x)
{
int i;
for(i=1;i<=5;i++)
{
   for(int j=1;j<=4;j++)
   {
       if(i==1||i==5)
       {
           if(j>1)
           System.out.print("*");
           else
           System.out.print(" ");
       }
       else if(j==1)
         System.out.print("*");
      else
      System.out.print(" ");
       
   }
 System.out.println();
}

}
}