package Serialization;

import java.io.*;

public class SrClassMain {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		File f = new File("D:/java_Shivaconcept/FileHandling/Serialization.txt");
		
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		SrClass obj = new SrClass(101,"Prajwal");
		
		oo.writeObject(obj);
		
		oo.close();
		
		System.out.println("Serialization Success...");
		
		

	}

}
