//Init block donot call if userdefine constructor is not created.

class InitBlock
{
	//this is constructor
	InitBlock()
	{
		System.out.println("Constructor 1");
	}
	
	//this is init block 1
	{
		System.out.println("Init Block 1");
	}
	
	//this is main method.
	public static void main(String...x)
	{
		System.out.println("Main Method 1");
		InitBlock obj = new InitBlock();
	}
	
	//this is init block 2
	{
		System.out.println("Init Block 2");
	}
}
