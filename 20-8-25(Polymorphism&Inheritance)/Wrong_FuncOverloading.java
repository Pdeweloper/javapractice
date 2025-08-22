class Wrong_FuncOverloading
{
	//in this , "returntype" is different but "param type and number" is same. 
	void add(int x,int y)
	{
		System.out.println("Int Function : "+(x+y));
	}
	int add(int x,int y)
	{
		System.out.println("Integre Function : "+(x+y));
	}
	
	//it will give error ,  it will not run , because of param same 
}