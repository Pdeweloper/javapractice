class SumofArrayElement
{
	public static void main(String...x)
	{
		int arr[] = {1,2,3,4,5,6};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.print("Sum of Array element is : "+sum);
	}
}
