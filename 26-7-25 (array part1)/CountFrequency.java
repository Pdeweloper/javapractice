class CountFrequency
{
public static void main(String...x)
{
int arr[]={1,2,2,3,4,5,6,4,5,5,2};

int maxfreq=0,maxfreqnum=arr[0];

for(int i=0;i<arr.length;i++)
{  
   boolean alpro = false;

   //checking already processed element. 
   for(int k=0;k<i;k++)
   {
      if(arr[i]==arr[k])
      alpro = true;
   } 

   //if already checked(alpro==true) then skip main loop
   if(alpro) 
   continue;

   //here we counting frequency of element.
   int cnt=1;
   for(int j=i+1;j<arr.length;j++)
   {
      if(arr[i]==arr[j])
      cnt++;
   }

   System.out.println("Frequency of "+arr[i]+" is : "+cnt);

   //here we assining the max count and element respectively.
   if(cnt>maxfreq)
   {
   maxfreqnum = arr[i];
   maxfreq=cnt;
   }
}

System.out.print(maxfreqnum+" has Highest frequence.");

}
}