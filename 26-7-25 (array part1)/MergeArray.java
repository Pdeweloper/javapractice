class MergeTwoArray
{
public static void main(String...x)
{
int arr1[]={1,2,3,4,5};
int arr2[]={4,5,6,7,8};

int finalarr[] = new int[arr1.length+arr2.length];

int index=0; //this var is used to show index of final array.

for(int i=0;i<arr1.length;i++)
{
   finalarr[index++]=arr1[i];  //first store on 0 index then index increase by 1;
}

for(int j=0;j<arr2.length;j++)
{
    boolean ispresent=false;
    for(int k=0;k<index;k++)
    {
       if(arr2[j]==finalarr[k])
       {
          ispresent=true;
          break;
       }
    }

   if(!ispresent)
   finalarr[index++]=arr2[j];

}

for(int p=0;p<index;p++)
{
   System.out.print(finalarr[p]+" ");
}

}
}

//------------------------------------------------------------------------------------------------------------------

class MergeThreeArray
{
public static void main(String...x)
{
int arr1[] = {1,2,3,4,5};
int arr2[] = {4,5,6,7,8};
int arr3[] = {7,8,9,10,11};
int finalarr[] = new int[arr1.length+arr2.length+arr3.length];

int index = 0;

for(int i=0;i<arr1.length;i++)
{
   finalarr[index++] = arr1[i];
}

for(int j=0;j<arr2.length;j++)
{
   boolean ispresent = false;
   for(int k=0;k<index;k++)
   {
      if(arr2[j]==finalarr[k])
      {
         ispresent = true;
         break;
      }
   }

   if(!ispresent)
   finalarr[index++] = arr2[j];
}

for(int l=0;l<arr3.length;l++)
{
   boolean ispresent = false;
   for(int k=0;k<index;k++)
   {
      if(arr3[l]==finalarr[k])
      {
         ispresent = true;
         break;
      }
   }

   if(!ispresent)
   finalarr[index++] = arr3[l];
}

for(int p=0;p<index;p++)
{
   System.out.print(finalarr[p]+" ");
}

System.out.println("length = "+finalarr.length);
}
}