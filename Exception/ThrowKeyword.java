class ThrowKeyword
{
	public static void main(String[] args)
	{
		//int num = 11;
		int num = 9;
		try
		{			
			if(num>10)
			{
				throw new ArithmeticException();
			}
			System.out.println("num is : "+num);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("num value must be less than 10");
			System.out.println("But num is : "+num);
		}
	}
}