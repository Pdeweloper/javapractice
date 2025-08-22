class Posible_FuncOverloading
{
	//in this overloading , type of param is different.
	/*
	void add(int x,int y)
	{
		System.out.println("Int Function : "+(x+y));
	}
	void add(Integer x,Integer y)
	{
		System.out.println("Integre Function : "+(x+y));
	}
	*/
	
	//in this overloading , returntype and type of param is different.
	/*
	void add(int x,int y)
	{
		System.out.println("Int Function : "+(x+y));
	}
	int add(Integer x,Integer y)
	{
		return (x+y);
	}
	*/
	
	//in this overloading , "type of param" same but "number of param" is different.
	/*
	void add(int x,int y)
	{
		System.out.println("2 param add Function : "+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("3 param add Function : "+(x+y+z));
	}
	*/
	
	//in this overloading , combination of param is different.
	/*
	void add(int x,float y)
	{
		System.out.println("int+float add Function : "+(x+y));
	}
	void add(float x,int y)
	{
		System.out.println("float+int add Function : "+(x+y));
	}
	*/
	
	//in this overloading , "datatype of param" same but "type of param" is different.
	void add(int x,int y)
	{
		//normal variable
		System.out.println("Int Function : "+(x+y));
	}
	void add(int x[],int y[])
	{
		//array variable.
		System.out.println("Int Function : "+(x[0]+y[0]));
	}
}

