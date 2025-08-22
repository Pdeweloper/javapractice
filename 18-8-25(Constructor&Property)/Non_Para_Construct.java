class Non_Para_Construct
{
	private int a,b;
	
	//this is non-param constructor , it will call in run time.
	Non_Para_Construct()
	{
		a=10;
		b=20;
		
		System.out.print("Addition by default Constructor : "+(a+b));
	}
}

class Non_Para_ConstructMain
{
	public static void main(String arg[])
	{
		//as we create object , contructor is called.
		Non_Para_Construct obj = new Non_Para_Construct();
	}
}