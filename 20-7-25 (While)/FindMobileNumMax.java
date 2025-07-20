class FindMobileNumMax
{
public static void main(String...arg)
{
String mob = "1234512345";
int max=mob.charAt(0)-'0';
int max2=-1,max3=-1;
int lgt = mob.length()-1;

int i = 1;
while(i<=lgt)
{
   int temp = mob.charAt(i)-'0';
 
   if(max==temp || max2==temp || max3==temp)
   {
      i++;
      continue;
   }

   if(max<temp)
   { 
      max3 = max2;
      max2 = max;
      max = temp;
   }
   else if(max2<temp)
   {
      max3 = max2;
      max2 = temp;
   }
   else if(max3<temp)
   {
      max3 = temp;
   }
  i++;
}

System.out.println("Max = "+max);
System.out.println("Second Max = "+max2);
System.out.println("Third Max = "+max3);

}
}