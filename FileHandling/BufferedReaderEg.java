package FileHandling;

import java.io.*;
public class BufferedReaderEg {

	public static void main(String[] args) throws IOException {
	
		try
		{
		FileReader fr = new FileReader("D:/java_Shivaconcept/FileHandling/hello1.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String data="",data1="";
		
		while((data1=br.readLine()) != null)
		{
			data+=data1;
		}
		
		System.out.print(data);
		}
		catch(IOException ex)
		{
			System.out.print(ex.getMessage());
		}

	}

}
