class UpperClass
{
	class InnerClass1
	{
		void fun()
		{
			System.out.println("This is InnerClass 1...");
		}
	}
	
	class InnerClass2
	{
		void fun()
		{
			System.out.println("This is InnerClass 1...");
		}
	}
}

class InnerMain
{
	public static void main(String...x)
	{
		UpperClass obj = new UpperClass();
		
		obj.new InnerClass1().fun();
		obj.new InnerClass2().fun();
	}
}