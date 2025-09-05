package FileHandling;

import java.io.*;
public class BinaryFileWrite {

	public static void main(String[] args) throws IOException {
		
		try
		{
		File f = new File("D:/java_Shivaconcept/FileHandling/Binary.txt");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		String s = "This is data of Binary File...";
		
		byte arr[] = s.getBytes();
		
		//here the data will converted into byte array
		//And process done with byte data , but store in String data.
		//Serializtion and Deserealization done automaticaly.
		fo.write(arr);
		
		fo.close();
		
		System.out.println("Binary File Created...");
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
