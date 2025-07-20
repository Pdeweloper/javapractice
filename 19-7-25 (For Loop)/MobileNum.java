class MobileNum
{
public static void main(String...x)
{
String mb = "9009346687";
int lgt = mb.length()-1,temp;

int max = mb.charAt(0)-'0',max2=-1,max3=-1;

//System.out.print(max+" , "+max2+" , "+max3);

for(int i=1;i<=lgt;i++)
{
  temp = mb.charAt(i)-'0'; 
 
  if(max==temp || max2==temp || max3==temp)
  continue;

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

}


System.out.println("Max - "+max);
System.out.println("Second Max - "+max2);
System.out.println("Third Max - "+max3);


}
}