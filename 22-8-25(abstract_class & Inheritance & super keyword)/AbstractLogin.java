abstract class AbstractLogin
{
	/*
	//we can declare varible in abstract class.
	String username;
	String password;
	
	//we can declare normal method in abstract class.
	void accept(String uname,String pass)
	{
		this.username=uname;
		this.password=pass;
	}
	*/
	
	abstract void accept(String uname,String pass);
	
	//we can declare abstract method in abstract class.
	abstract void verifyLogin();
	abstract void resetPass();
}