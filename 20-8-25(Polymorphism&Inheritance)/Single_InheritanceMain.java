class Single_InheritanceMain
{
	public static void main(String []arg)
	{
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		//here we are calling SETTER by Dog class but it is present in Animla class.
		
		//so Dog Class inherite the Feature of Animal class.
		dog1.setname("Tomy");
		dog1.setage(5);
		dog1.info();
		
		System.out.println();
		
		dog1.setname("Shera");
		dog1.setage(10);
		dog1.info();
	}
}