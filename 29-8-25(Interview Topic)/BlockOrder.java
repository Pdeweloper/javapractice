class BlockOrder
{
	//constructor
	BlockOrder()
	{
		System.out.println("Constructor 1");
	}
	
	//static block 1
	static
	{
		System.out.println("Static Block 1");
	}
	
	//init block 1
	{
		System.out.println("Init Block 1");
	}
	
	//Main Method.
	public static void main(String...x)
	{
		System.out.println("Main Method 1");
		InitBlock obj = new InitBlock();
	}
	
	//this is init block 2
		{
			System.out.println("Init Block 2");
		}
		
		//static block 2
		static
		{
			System.out.println("Static Block 2");
		}
}

/*
this will execute as :-
Static Block 1
Static Block 2
Main Method 1
Init Block 1
Init Block 2
Constructor 1
*/