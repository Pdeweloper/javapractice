class CharArrayPallindrom
{
	public static void main(String...x)
	{
		char charr[] = {'m','a','d','a','m'};
		int size = charr.length-1;
		
		String s = "pallindrom";
		for(int i=0;i<charr.length/2;i++)
		{
			if(charr[i]!=charr[size-i])
			{
				s = "not pallindrom";
				break;
			}
		}
		
		System.out.print("Given character array is "+s);
	}
}
