//1st we can inherite using compositon without inheritance.

//2nd we can make varible and method static in parent class.

class WI1
{
	static int x=100;
	
	static void fun()
	{
		System.out.println("This is Parent class method");
	}
}

class WI2
{
	void display()
	{
		//accessing Parent class variable value without inheritance.
		System.out.println("Paraent class varible value : "+WI1.x);
		
		//calling Parent class method without inheritance.
		WI1.fun();
	}
}

class WIMain
{
	public static void main(String...x)
	{
		WI2 obj = new WI2();
		
		//object of child class created.
		//but we display Parent class variable value and method.
		obj.display();
	}
}