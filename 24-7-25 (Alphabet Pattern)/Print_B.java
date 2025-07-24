class Print_B
{
public static void main(String...x)
{

for(int i=1;i<=7;i++)
{
   if(i==1 || i==7)
   {
      for(int j=1;j<=6;j++)
      {  
         if(j==6)
         System.out.print(" ");
         else
         System.out.print("*");
      }
   }

   if(i==2||i==3||i==5||i==6)
   {
      for(int k=1;k<=6;k++)
      {
         if(k==1||k==6)
         System.out.print("*");
         else
         {
           for(int s=1;s<2;s++)
           {System.out.print(" ");}
         }
      }
   }

   if(i==4)
   {
      for(int l=1;l<=5;l++)
      {
         System.out.print("*");
      }
   }
 System.out.println();
}

}
}

