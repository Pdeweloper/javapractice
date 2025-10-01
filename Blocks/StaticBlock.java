package Blocks;

public class StaticBlock {
	
	static {
		System.out.println("This is Static block-1");
	}

	public static void main(String[] args) {
		
		System.out.println("This is main block...");
	}
	
	static {
		System.out.println("This is Static block-2");
	}

}

// firstly dono static block execute honge.
//Then main block execute hoga.