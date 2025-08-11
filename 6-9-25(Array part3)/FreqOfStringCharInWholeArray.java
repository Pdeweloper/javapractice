class FreqOfStringCharInWholeArray
{
	public static void main(String...x)
	{
		String sarr[] = {"rama","aman","shayam"};
		char code = '"'; //to display doublecode(") in lines.
		String addst = "";
		
	// HERE WE COUNT FOR PERTICULAR STRING ELEMENT
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
	  
	  //HERE WE ARE CONCATINATING ALL STRING ELEMENT
	  for(int l=0;l<sarr.length;l++)
	  {
		 addst += sarr[l];
	  }
	  
	  // HERE WE COUNT CHAR IN WHOLE STRING ARRAY
	  for(int l=0;l<addst.length();l++)
	  {
		char s = addst.charAt(l);
		
			boolean alpro = false; //checking already proccessed.
			for(int k=0;k<l;k++)
			{
				if(s==addst.charAt(k))
				{
					alpro = true;
					break;
				}
			}
			
			int cont=1;
			for(int j=l+1;j<addst.length() && !alpro;j++)//check each char with next all char 
			{
				if(s==addst.charAt(j))
					cont++;  //increase count if char matched.
			}
			
			//printing count(frequency)of char in whole array.
			if(!alpro)
				System.out.println("Frequency of "+s+" in whole array is  : "+cont); 
		}
		System.out.println();
	  
	  
	  
	}
}