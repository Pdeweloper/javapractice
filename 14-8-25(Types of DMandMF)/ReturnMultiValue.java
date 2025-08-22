class ReturnMultiValue
{
	int rtval[] = new int[5];
	private int a,b;
	
	void getdata(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void add()
	{
		int sum = a+b;
		rtval[0] = sum;
	}
	
	void sub()
	{
		int sub = a-b;
		rtval[1] = sub;
	}
	
	void mult()
	{
		int mult = a*b;
		rtval[2] = mult;
	}
	
	int[] returnarr()
	{
		return rtval;
	}
}
