package Blocks;

public class InitBlock {

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

//isme first Main block execute hoga.
//Then Second init block execute hoga , before constructor
//last me constructor execute hoga.