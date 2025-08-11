class CWPattern1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

//---------------------------------------------------------------------------------------

class CWPattern2 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//---------------------------------------------------------------------------------------

class CWPattern3
{
	public static void main(String...x)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				if(i%2!=0)
				System.out.print(j);
			    else
				System.out.print(6-j);
			}
			System.out.println();
		}
	}
}

//---------------------------------------------------------------------------------------

class CWPattern4
{
	public static void main(String...x)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				if(i%2!=0)
					System.out.print("*");
				else
					System.out.print("@");
			}
			System.out.println();
		}
	}
}

//---------------------------------------------------------------------------------------

class CWPattern5
{
	public static void main(String...x)
	{
		
		for(int i=1;i<=5;i++)
		{
			char a = 'a';
		    char A = 'A';
			for(int j=1;j<=6-i;j++)
			{
				if(i%2!=0)
					System.out.print(A++);
				else
				{
					if(j==1)
						System.out.print("A");
					else
						System.out.print(++a);
				}
			}
			System.out.println();
		}
	}
}

//---------------------------------------------------------------------------------------

class CWPattern6
{
	public static void main(String...x)
	{
		for(int i=1;i<=5;i++)
		{
			char a = 'a';
			char A = 'A';
			for(int j=1;j<=6-i;j++)
			{
				if(j%2!=0)
					System.out.print(A++);
				else
					System.out.print(++a);
			}
			System.out.println();
		}
	}
}