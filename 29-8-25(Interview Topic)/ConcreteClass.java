abstract class AbstractClass
{
	abstract void say1();
	abstract void say2();
}

//this is concrete class ,  which is inherite the abstract class.
class ConcreteClass extends AbstractClass
{
	void say1()
	{
		System.out.println("This is finction 1 of Abstarct class");
	}
	
	void say2()
	{
		System.out.println("This is finction 2 of Abstarct class");
	}
}

class ConcreteMain
{
	public static void main(String...x)
	{
		AbstractClass obj = new ConcreteClass();
		
		obj.say1();
		obj.say2();
	}
}