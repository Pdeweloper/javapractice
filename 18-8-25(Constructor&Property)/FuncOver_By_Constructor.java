//In this we are using same name constructor multiple time
//this is called function Overloading (same name , different param).

class FuncOver_By_Constructor
{
	int a,b,c;
	
	//this is default Constructor.
	FuncOver_By_Constructor()
	{
		a=10;
		b=20;
		System.out.println("Default Constructor : "+(a+b));
	}
	
	//this is 2 Parameter Constructor.
	FuncOver_By_Constructor(int x,int y)
	{
		this.a=x;
		this.b=y;
		System.out.println("2 Parameter Constructor : "+(a+b));
	}
	
	//this is 3 Parameter Constructor.
	FuncOver_By_Constructor(int x,int y,int z)
	{
		this.a=x;
		this.b=y;
		this.c=z;
		System.out.println("3 Parameter Constructor : "+(a+b+c));
	}
}
	
class FuncOver_By_ConstructorMain
{
	public static void main(String...x)
	{
		//calling default constructor
		FuncOver_By_Constructor obj = new FuncOver_By_Constructor();
		
		//calling 2 parameter constructor
		FuncOver_By_Constructor obj1 = new FuncOver_By_Constructor(5,10);
		
		//calling 3 parameter constructor
		FuncOver_By_Constructor obj2 = new FuncOver_By_Constructor(1,2,3);
	}
}