class LimitedObjMain
{
	public static void main(String []args)
	{
		LimitedObject obj = new LimitedObject();
		LimitedObject obj1 = new LimitedObject();
		LimitedObject obj2 = new LimitedObject();
		
		//here we creating 4th object. out of limit.
		LimitedObject obj3 = new LimitedObject();
	}
}