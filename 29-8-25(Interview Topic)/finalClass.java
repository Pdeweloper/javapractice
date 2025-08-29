//final class cannot be inherite , except this we can do anything.
//inherite karne ke alawa ham sabhi oops ke feature use kar sakte he.

final class FinalClass
{
	String greet = "Hello";
	void say()
	{
		System.out.println(greet+" This is final class");
	}
}

//if you will uncomment this class, then compiler will give error:-
//"error: cannot inherit from final FinalClass"
/*
class NormalClass extends FinalClass
{
	void say()
	{
		System.out.println(greet+"this is class which is try to inherite final class");
	}
}
*/

class FinalMain
{
	public static void main(String...x)
	{
		//we can also create obj of final class.
		FinalClass obj = new FinalClass();
		obj.say();
		
		//NormalClass obj1 = new NormalClass();
		//obj1.say();
	}
}