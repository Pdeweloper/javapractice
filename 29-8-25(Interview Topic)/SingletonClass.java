//we can create only one obj of singleton class
class SingletonClass
{
	static SingletonClass obj = null;
	
	//we created private constructor. so we can not create direct object.
	private SingletonClass()
	{
	}
	
	//this function is used to create and return object of SingletonClass.
	public static SingletonClass getObject()
	{
		if(obj==null)
		{
			//here we create only 1 obj.
			obj = new SingletonClass();
			System.out.println("Object is created...");
		}
		else
		{
			System.out.println("Only One object can create...");
		}
		
		return obj;
	}
	
	//this function display messege.
	void funcSay()
	{
		System.out.println("This is SingletonClass...");
	}
}

class SingletonMain
{
	public static void main(String...x)
	{
		//this will create obj.
		SingletonClass obj = SingletonClass.getObject();
		obj.funcSay();
		
		//this will not create obj. but it will execute.
		//it is only a reference. which point already created object.
		SingletonClass obj1 = SingletonClass.getObject();
		obj1.funcSay();
	}
}