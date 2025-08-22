class FuncOverriding
{
	void sayhii()
	{
		System.out.println("This is FuncOverriding Part 1");
	}
}

class FuncOverriding1 extends FuncOverriding
{
	//here we used same function of above class using inheritance
	void sayhii()
	{
		System.out.println("This is FuncOverriding Part 2");
	}
}
