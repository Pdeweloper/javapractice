//interface is pure abstract class , in this we only declare rules(method)
//we connot implement/define rules.

interface InterfaceLogin
{
	//this methods are by default "public abstract" in interface.
	void accept(String uname,String pass);
	void verifyLogin();
	void resetPass();
}

//this is concrete(child) class of interface.
class UserLoginInter implements InterfaceLogin
{
	//in this class we are implementing all methods of interface.
	String username,password;
	public void accept(String uname,String pass)
	{
		this.username=uname;
		this.password=pass;
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