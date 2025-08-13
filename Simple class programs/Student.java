class Student
{
	private int rollno;
	private String stuname;
	
	public void accept(int rno,String sname)
	{
		this.rollno=rno;
		this.stuname=sname;
	}
	
	public void display()
	{
		System.out.println(String.format("rno %d is %s",rollno,stuname));
	}
}	

/*
IMPORTANT NOTE : 

Class ke private varible name 
this.var ka var_name
And display karne wale varible name 

All same hona chahhiye. 
*/