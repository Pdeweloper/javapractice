//this interface is for signup.
interface Interface1
{
	void accept(String uname,String pass);
	void signup();
}

//this interface is for login.
interface Interface2
{
	void accept(String uname,String pass);
	void verifyLogin();
	void resetPass();
}

//this class inherite two interfaces. this is multiple inheritance.
class UserMultiInheri implements Interface1,Interface2
{
	String username,password;
	public void accept(String uname,String pass)
	{
		this.username=uname;
		this.password=pass;
	}
	
	public void signup()
	{
		System.out.println("Sign Up Successfully");
	}
	
	public void verifyLogin()
	{
		if(this.username=="Prajwal" && this.password=="123")
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Invalid username or password");
		}
	}
	
	public void resetPass()
	{
		this.password="456";
	}
}