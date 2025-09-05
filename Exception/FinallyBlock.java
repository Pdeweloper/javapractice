class FinallyBlock {

	public static void main(String[] args) {
		
		String s = "success";
		
		try
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("Sum is :"+(a+b));
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Exception : Enter only Integer");
			s="Fail";
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception : Enter 2 values");
			s="Fail";
		}		
         
        //finally block always execute hota he,
		//try ya catch execute hone ke baad.		 
		finally
		{
			System.out.println(s);
		}
	}

}