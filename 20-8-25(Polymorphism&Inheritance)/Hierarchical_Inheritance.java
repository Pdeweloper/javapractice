//1st class
class Car
{
	private String name,color,engintype;
	
	//here SETTER and GETTER for name varible.
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	
	//here SETTER and GETTER for color varible.
	public void setcolor(String cl)
	{
		this.color=cl;
	}
	public String getcolor()
	{
		return this.color;
	}
	
	//here SETTER and GETTER for engintype varible.
	public void setengintype(String et)
	{
		this.engintype=et;
	}
	public String getengintype()
	{
		return this.engintype;
	}
}

//2nd class.
class Lambo extends Car
{
	private String model;
	
	//here SETTER and GETTER for model varible.
	public void setmodel(String md)
	{
		this.model=md;
	}
	public String getmodel()
	{
		return this.model;
	}
}

//3rd class.
class Maruti extends Car
{
	private int price;
	
	//here SETTER and GETTER for price varible.
	public void setprice(int pr)
	{
		this.price=pr;
	}
	public int getprice()
	{
		return this.price;
	}
}
	
	