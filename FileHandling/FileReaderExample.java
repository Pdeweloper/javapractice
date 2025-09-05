package FileHandling;

import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		try
		{
		File f = new File("D:/java_Shivaconcept/FileHandling/hello.txt");
		
		FileReader fr = new FileReader(f);
		
		String data="";
		int data1;
		
		//here fr.read() method will give int type data 
		// so we have to typcast it in character.
		//and after read all data in last it will return -1;
 		while((data1=fr.read()) != -1)
		{
			data+=(char)data1;
		}
 		
 		System.out.print(data);
		}
		catch(IOException ex)
		{
			System.out.print(ex.getMessage());
		}

	}

}
