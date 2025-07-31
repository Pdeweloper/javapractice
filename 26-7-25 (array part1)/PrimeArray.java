class PrimeArray
{
public static void main(String...x)
{
int arr[]={1,2,3,4,5,6,7,8,9};

for(int i=0;i<arr.length;i++)
{
   if(arr[i]<2) //this for not check 1 for prime.
   continue;

   boolean prime=true;
   for(int j=2;j<arr[i];j++)
   { 
      if(arr[i]%j==0)
      {
        prime=false;
        break;
      }
   }

   if(prime)
   System.out.print(arr[i]+" ");
}

}
}