class AddWithoutOperator
{
	public static void main(String...x)
	{
		int a=10;
		int b=20;
		
		int c = a-(-b); 
		//it means '-' + '-' = '+'
		
		System.out.print("Addition without + operator : "+c);
	}
}