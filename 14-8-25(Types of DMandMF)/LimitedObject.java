class LimitedObject
{
	static int count=0;
	
	LimitedObject()
	{
		if(count>=3)
		{
			System.out.println("NO more object can be created...");
			System.exit(0);
		}
		count++;
		
		System.out.println(count+" Object created..");
	}
}