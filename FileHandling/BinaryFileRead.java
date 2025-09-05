package FileHandling;

import java.io.*;
public class BinaryFileRead {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:/java_Shivaconcept/FileHandling/Binary.txt");
		
		FileInputStream fi = new FileInputStream(f);
		
		//we declare byte array of 60 bytes size.
		byte arr[] = new byte[60];
		int a=0;
		
		//fi can read upto 60 bytes.
		while((a=fi.read(arr)) != -1)
		{
			//we convert the byte array into string.
			String s = new String(arr);
			System.out.println(s);
			
			//a will show that how many byte calculated.
			//System.out.println(a);
		}

	}

}
