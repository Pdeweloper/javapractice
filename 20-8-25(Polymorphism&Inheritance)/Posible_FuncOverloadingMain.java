class Posible_FuncOverloadingMain
{
	public static void main(String...x)
	{
		Posible_FuncOverloading obj = new Posible_FuncOverloading();
		
		//in this overloading , type of param is different.
		/*
		obj.add(10,20);
		
		Integer a=1,b=2;
		obj.add(a,b);
		*/
		
		//in this overloading , returntype and type of param is different.
		/*
		obj.add(5,10);
		
		Integer a=2,b=5;
		int ans =obj.add(a,b);
		System.out.print("Interger Function : "+ans);
		*/
		
		//in this overloading , "type of param" same but "number of param" is different.
		/*
		obj.add(6,6);
		obj.add(9,9,9);
		*/
		
		//in this overloading , combination of param is different.
		/*
		obj.add(10,5.2f);
		obj.add(6.3f,10);
		*/
		
		//in this overloading , "datatype of param" same but "type of param" is different.
		obj.add(5,5);
		
		int a[] = {4};
		int b[] = {5};
		obj.add(a,b);
	}
}