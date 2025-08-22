class Param_Construct
{
	int a,b;
	
	//this is parameterized constructor , it will call in run time.
	Param_Construct(int x,int y)
	{
		this.a=x;
		this.b=y;
		
		System.out.print("Addition by Parameterised Constructor : "+(a+b));
	}
}

class Param_ConstructMain
{
	public static void main(String []arg)
	{
		//as we create object , contructor is called.
		
		//we are passing value in constructor using following statment.
		Param_Construct obj = new Param_Construct(1,2);
	}
}