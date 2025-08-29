class Engine
{
	String s = "Engine Name";
	
	void engineInfo()
	{
		System.out.println("This is engine info...");
	}
}

class Car
{
	Engine eg = new Engine(); //this is composition(HAS-A relationship)
	
	void display()
	{
		//accessing Engine class variable without inheritance.
		System.out.println("Engine Class Variable value : "+eg.s);
		
		//calling Engine class method without inheritance.
		eg.engineInfo();
	}
}

class CompositionMain
{
	public static void main(String...x)
	{
		Car obj = new Car();
		
		//object of class2 created.
		//but we display class1 variable value and method.
		obj.display();
	}
}
