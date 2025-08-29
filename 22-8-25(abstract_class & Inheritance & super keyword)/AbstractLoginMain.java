class MainLogin
{
	public static void main(String arg[])
	{
		AbstractLogin obj = new UserLogin();
		
		obj.accept("Prajwal","456");
		obj.verifyLogin();
		obj.resetPass();
		obj.verifyLogin();
	}
}
