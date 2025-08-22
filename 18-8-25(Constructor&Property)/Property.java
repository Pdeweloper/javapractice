//property is used to set and get value of class data member.
//It has two function GETTER and SETTER 

//it has naming convention. -> returntype get+var_name()  , returntype set+var_name().

class Property
{
	private int a,b;
	
	//this getter is to read "a value".
	public int geta()
	{
		return this.a;
	}
	
	//this setter is used to write "b value".
	public void seta(int x)
	{
		this.a=x;
	}
	
	//this getter is to read "b value".
	public int getb()
	{
		return this.b;
	}
	
	//this setter is used to write "b value".
	public void setb(int x)
	{
		this.b=x;
	}
}