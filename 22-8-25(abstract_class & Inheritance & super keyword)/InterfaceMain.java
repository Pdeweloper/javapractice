class InterfaceMain
{
	public static void main(String []args)
	{
		InterfaceLogin obj = new UserLoginInter();
		
		obj.accept("Prajwal","123");
		obj.verifyLogin();
		obj.resetPass();
		obj.verifyLogin();
	}
}