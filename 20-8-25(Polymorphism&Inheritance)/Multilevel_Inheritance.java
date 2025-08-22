class Admin
{
	int id;
	String name;
	
	//here SETTER and GETTER for id varible. 
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return this.id;
	}
	
	//here SETTER and GETTER for name varible.
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
}

//Manager Class inherite Admin Class feature.
class Manager extends Admin
{
	int salary;
	
	//here SETTER and GETTER for salary varible.
	public void setsalary(int sl)
	{
		this.salary=sl;
	}
	public int getsalary()
	{
		return this.salary;
	}
}

//Employee Class inherite Manager Class feature . it is also inherite Admin class indirectly.
class Employee extends Manager
{
	String project_name;
	
	//here SETTER and GETTER for project_name varible.
	public void setproject_name(String pn)
	{
		this.project_name=pn;
	}
	public String getproject_name()
	{
		return this.project_name;
	}
}