class EvenOddSum
{
public static void main(String...x)
{
int arr[]={1,2,3,4,5,6,7,8,9,10};
int sumE=0,sumO=0;

for(int i=0;i<arr.length;i++)
{
   if(arr[i]%2==0)
   {
      sumE+=arr[i];
   }
   else
   { 
     sumO+=arr[i];
   }   
}

System.out.println("Sum of Even Nums : "+sumE);
System.out.println("Sum of Odd Nums : "+sumO);

}
}