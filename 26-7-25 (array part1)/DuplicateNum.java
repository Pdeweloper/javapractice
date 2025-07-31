class DuplicateNum
{
public static void main(String...x)
{
int arr[]={1,2,2,3,4,5,6,4,5,5,2};
int dupl[]= new int[5];
int d=0;

System.out.print("After Remove Duplicates \nArray is : ");
for(int i=0;i<arr.length;i++)
{
  boolean isdupl = false;
  
  //here checking duplicate. if duplicate found then isdupl=true.
  for(int j=i+1;j<arr.length;j++)
  {
    if(arr[i]==arr[j])
    {
       isdupl = true;
       break;
    }
  }
  
  //here checking already process element. if processed alprint=true else alprint=false.
  boolean alprint = false;
  for(int k=0;k<i;k++)
  {  
     if(arr[i]==arr[k])
     {
       alprint = true;
       break;
     }
  }
 
  //if element is not already printed(means alprint=false), print element. 
  if(!alprint)
  System.out.print(arr[i]+" ");

  //if isdupl=true AND alprint=false , store element in dupl array.
  if(isdupl && !alprint)
  {  
    dupl[d] = arr[i];
    d++;
  }

}

//Using Following loop we printing duplicates element

System.out.print("\nDuplicates are : ");
for(int p=0;p<d;p++)
{
  System.out.print(dupl[p]+" ");
}

}
}