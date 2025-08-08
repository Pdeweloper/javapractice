class ArrayElementBinary
{
public static void main(String...x)
{
int decarr[] = {1,2,3,4,5,6};

System.out.print("Array is : ");
for(int i=0;i<decarr.length;i++)
{
   System.out.print(decarr[i]+" ");
}

System.out.println();

System.out.print("Binary Array is : ");
for(int i=0;i<decarr.length;i++)
{
   int num=decarr[i];
   String s="";
   while(num!=0)
   {
      s+=num%2;
      num/=2;
   }
  
   for(int p=s.length()-1;p>=0;p--)
   {
        System.out.print(s.charAt(p));
   }
 System.out.print(" ");
}

}
}
