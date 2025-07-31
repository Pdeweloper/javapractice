class SecondMax
{
public static void main(String...x)
{
int arr[] = {10,2,7,9,8};

int max=arr[0],max2=-1;

for(int i=1;i<arr.length;i++)
{
   if(max<arr[i])
   {
     max2=max;
     max=arr[i];
   }
   else if(max>arr[i] && max2<arr[i])
   {
      max2=arr[i];
   }
}

System.out.print("Second Max is : "+max2);

}
}