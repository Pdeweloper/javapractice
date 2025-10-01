package Blocks;

public class BlockOrder {

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

//ye sabhi order me execute honge

/* static block
 * main block
 * init block
 * constructor block 
 */
