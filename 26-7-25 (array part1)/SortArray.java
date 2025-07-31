class SortArray
{
public static void main(String...x)
{
int arr[]={1,2,5,9,7,3,6};

System.out.print("Before Sort Array was : ");
for(int j=0;j<arr.length;j++)
{
 System.out.print(arr[j]+" ");
}

int i=0;
while(i<arr.length-1)
{
   if(arr[i]>arr[i+1])
   {
     int temp = arr[i];
     arr[i] = arr[i+1];
     arr[i+1] = temp;

     i=0;  //after swap the element , reset 'i' and again start form index 0.
   }
   else
    i++;
} 


System.out.print("\nAfter Sort Array is : ");
for(int k=0;k<arr.length;k++)
{
 System.out.print(arr[k]+" ");
}

}
}
