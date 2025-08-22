//Example of single inheritance ,  here Dog class inherite property of Animal class

class Animal
{
	String name;
	int age;
	
    public String getname()
	{
		return this.name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return this.age;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
}

class Dog extends Animal
{
	void info()
	{
		System.out.println("I am a Dog : ");
		
		//here we are taking value from class Animal using GETTER.
		System.out.println(String.format("My name is %s\nMy age is %d",getname(),getage()));
	}
}