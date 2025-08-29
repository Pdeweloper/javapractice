//this is parent class.
class ParentSuper
{
	ParentSuper()
	{
		System.out.println("This is Parent Constructor.");
	}
	
	void fun()
	{
		System.out.println("This is fun 1");
	}
}

//this is child class which inherite parent class.
class ChildSuper extends ParentSuper
{
	ChildSuper()
	{
		//super keyword refer the parent class.
		
		//this "super" keyword calling the contructor of parent class.
		super();
		System.out.println("This is Child Constructor.");
	}
	
	void fun1()
	{
		//this "super" keyword calling parent class function named as fun().
		super.fun();
		System.out.println("This is fun 2");
	}
}

class SuperMain
{
	public static void main(String...x)
	{
		ChildSuper obj = new ChildSuper();
		
		//we created object of child calss ,
		//but parent class constructor and method also calling , using "super" keyword
		obj.fun1();
	}
}