class StaticBlock
{
	//this is static block, which execute before main method.
	static
	{
		System.out.println("Static Block 1");
	}
	
	static
	{
		System.out.println("Static Block 2");
	}
	
	//this is main method.
	public static void main(String...x)
	{
		System.out.println("Main Method");
	}
}
	