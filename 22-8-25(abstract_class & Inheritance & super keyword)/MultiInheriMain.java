class MultiInheriMain
{
	public static void main(String []args)
	{
		Interface1 obj = new UserMultiInheri();
		
		obj.accept("Prajwal","123");
		obj.signup();
		
		Interface2 obj1 = new UserMultiInheri();
		
		obj1.accept("Prajwal","123");
		obj1.verifyLogin();
		obj1.resetPass();
		obj1.verifyLogin();
	}
}
		