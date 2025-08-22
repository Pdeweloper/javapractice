class FuncOverridingMain
{
	public static void main(String...x)
	{
		//this obj is for 1st class
		FuncOverriding obj = new FuncOverriding();
		
		//this obj is for 2nd class
		FuncOverriding1 obj1 = new FuncOverriding1();
		
		//both object calling same method , this is function Overriding.
		obj.sayhii();
		obj1.sayhii();
	}
}