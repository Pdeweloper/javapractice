package FileHandling;

import java.io.*;

public class BufferedWriterEg {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		try
		{
			//we use true argument for prevent from overwriting.
		FileWriter fw = new FileWriter("D:/java_Shivaconcept/FileHandling/hello1.txt",true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello This is Example File of BufferedWriter...");
		bw.newLine();
		bw.write("This is second Line to Test...");
		bw.newLine();
		
		bw.close();
		
		System.out.print("File Created...");
		}
		catch(IOException ex)
		{
			System.out.print(ex.getMessage());
		}

	}

}
