class UniqueElement
{
public static void main(String...x)
{
int arr[]={1,2,3,4,5,2,5,6,7,5,2,4};

for(int i=0;i<arr.length;i++)
{
  boolean alpros=false;
  for(int k=0;k<i;k++)
  {
      if(arr[i]==arr[k])
      {
         alpros=true;
         break;
      }
  }
  
  if(alpros)
  continue;
  
   boolean isdupli = false;
   for(int j=i+1;j<arr.length;j++)
   {
      if(arr[i]==arr[j])
      {
         isdupli=true;
         break;
      }
   }

   if(!isdupli)
   System.out.print(arr[i]+" ");
}

}
}