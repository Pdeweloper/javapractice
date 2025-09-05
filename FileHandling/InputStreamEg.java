package FileHandling;

import java.io.*;
public class InputStreamEg {

	public static void main(String[] args) throws IOException {
		
		try
		{
		FileWriter fw = new FileWriter("D:/java_Shivaconcept/FileHandling/hello2.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("Enter Content : ");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		bw.write(br.readLine());
		
		bw.close();
		
		System.out.println("File created..");
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
