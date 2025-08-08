class FreqOfStringChar
{
	public static void main(String...x)
	{
		String s = "amitabbachchan";
		
		for(int i=0;i<s.length();i++)
		{
			boolean alpro = false; //checking already proccessed.
			for(int k=0;k<i;k++)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					alpro = true;
					break;
				}
			}
			
			int cont=1;
			for(int j=i+1;j<s.length() && !alpro;j++)//check each char with next all char 
			{
				if(s.charAt(i)==s.charAt(j))
					cont++;  //increase count if char matched.
			}
			
			//printing count(frequency) for perticular char.
			if(!alpro)
				System.out.println("Frequency of "+s.charAt(i)+" : "+cont); 
		}
	}
}

//-------------------------------------------------------------------------

class FreqOfStringCharInArray
{
	public static void main(String...x)
	{
		String sarr[] = {"nitin","aashish","amitab"};
		char code = '"'; //to display doublecode(") in lines.
		
	  for(int l=0;l<sarr.length;l++)
	  {
		String s = sarr[l];
		System.out.println("Frequency of "+code+sarr[l]+code+" string characters : ");
		for(int i=0;i<s.length();i++)
		{
			boolean alpro = false; //checking already proccessed.
			for(int k=0;k<i;k++)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					alpro = true;
					break;
				}
			}
			
			int cont=1;
			for(int j=i+1;j<s.length() && !alpro;j++)//check each char with next all char 
			{
				if(s.charAt(i)==s.charAt(j))
					cont++;  //increase count if char matched.
			}
			
			//printing count(frequency) for perticular char.
			if(!alpro)
				System.out.println("Frequency of "+s.charAt(i)+" : "+cont); 
		}
		System.out.println();
	  }
	}
}