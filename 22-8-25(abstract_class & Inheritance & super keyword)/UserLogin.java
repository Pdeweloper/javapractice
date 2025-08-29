class UserLogin extends AbstractLogin
{
	String username,password;
	void accept(String uname,String pass)
	{
		this.username=uname;
		this.password=pass;
	}
	
	void verifyLogin()
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
	
	void resetPass()
	{
		this.password="123";
	}
}