class NormalTryCatch {
	
	void display()
	{
		System.out.println("This is a Class...");
	}

	public static void main(String[] args) {
		
		try {
			NormalTryCatch obj=null;
			obj.display();
		}
		catch(Exception ex)
		{
			System.out.println("Object must not be null");
			
			//getMessage() ek method he
			//jisse ham Exception ka System generated message show kar sakte he.
			//System.out.print(ex.getMessage());
		}

	}

}