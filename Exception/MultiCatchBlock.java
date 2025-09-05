class MultiCatchBlock {

	public static void main(String[] args) {
		
		try
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("Sum is :"+(a+b));
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Enter only Integer");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Enter 2 values");
		}	

	}

}