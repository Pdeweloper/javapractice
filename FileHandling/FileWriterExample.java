package FileHandling;
import java.io.*;

public class FileWriterExample {

	public static void main(String...x) throws IOException
	{
		try
		{
		File f = new File("D:/java_Shivaconcept/FileHandling/hello.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Hello World...My name is Prajwal");
		fw.close();
		
		System.out.print("File created...");
		}
		catch(IOException ex)
		{
			System.out.print(ex.getMessage());
		}
		
	}
}
