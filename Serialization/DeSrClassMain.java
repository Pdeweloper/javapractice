package Serialization;

import java.io.*;
public class DeSrClassMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("D:/java_Shivaconcept/FileHandling/Serialization.txt");
		
		FileInputStream fi = new FileInputStream(f);
		
		SrClass obj1 = null;
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		obj1 = (SrClass)oi.readObject();
		
//		obj1.rno = 102;
		
		System.out.println(obj1.rno+"\n"+obj1.sname);
		
		oi.close();

	}

}
