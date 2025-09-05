class CustomException
{
	public static void main(String...x)
	{
		//int num = -2; //it will give exception
		int num = 2;
		try
		{
			if(num<0)
			{
				//we are throwing custom class if condition true.
				throw new NegativeNumberException();
			}
			System.out.println("num is : "+num);
		}
		catch(NegativeNumberException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("But num is : "+num);
		}
	}
}

//this is a class which inherite ArithmeticException Class
//it is like a Custom Exception class.
class NegativeNumberException extends ArithmeticException
{
	public String getMessage()
	{
		return "Num value must be Positive";
	}
}