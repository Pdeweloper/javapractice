class SplitArray
{
public static void main(String...x)
{
int arr[] = {1,2,3,4,5,6,7,8};
int size=arr.length;
int s1,s2,s3;

s1 = size/3;
s2 = size/3;
s3 = size - (s1+s2);

int arr1[] = new int[s1];
int arr2[] = new int[s2];
int arr3[] = new int[s3];

//Storing array element in first array(length of s1)
for(int i=0;i<s1;i++)
{
  arr1[i] = arr[i];
}

//Storing next array element in second array(length of s2)
for(int i=0;i<s2;i++)
{
  arr2[i] = arr[i+s1];
}

//Storing remaining array element in third array(length of s3)
for(int i=0;i<s3;i++)
{
  arr3[i] = arr[i+(s1+s2)];
}

//Printing arr1,arr2,arr3

System.out.print("First array : ");
for(int a1:arr1)
{
  System.out.print(a1+" ");
}

System.out.println();
System.out.print("Second array : ");
for(int a2:arr2)
{
  System.out.print(a2+" ");
}

System.out.println();
System.out.print("Third array : ");
for(int a3:arr3)
{
  System.out.print(a3+" ");
}

}
}