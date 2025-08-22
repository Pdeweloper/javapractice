class PropertyMain
{
	public static void main(String...x)
	{
		Property obj = new Property();
		
		//write value in a
		obj.seta(10);
		
		//read value of a
		System.out.println("Getter of a : "+obj.geta());
		
		//write value in b
		obj.setb(20);
		
		//read value of b
		System.out.println("Getter of b : "+obj.getb());
	}
}