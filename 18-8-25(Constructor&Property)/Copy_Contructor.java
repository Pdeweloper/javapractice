class Copy_Contructor
{
	int a,b;
	
	Copy_Contructor(int x,int y)
	{
		this.a=x;
		this.b=y;
	}
	
	Copy_Contructor(Copy_Contructor c)
	{
		this.a=c.a;
		this.b=c.b;
		
		System.out.println("Copy Constructor : "+(a+b));
	}
}

class Copy_ContructorMain
{
	public static void main(String...x)
	{
		Copy_Contructor obj = new Copy_Contructor(10,5);
		
		//here we are passing "obj(reference)" in copy constructor.
		Copy_Contructor cobj = new Copy_Contructor(obj);
	}
}