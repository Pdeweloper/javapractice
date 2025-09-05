package Serialization;

import java.io.*;

public class TransientMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialization
		File f = new File("D:/java_Shivaconcept/FileHandling/Transient.txt");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		TransientClass obj = new TransientClass(101,"Prajwal",10000);
		
		oo.writeObject(obj);
		
		oo.close();
		
		System.out.println("Serialization Success...");
		
		//Deserialization
		
		FileInputStream fi = new FileInputStream(f);
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		TransientClass obj1=null;
		
		obj1 = (TransientClass)oi.readObject();
		
		System.out.println("\nData After Deserialization are :");
		System.out.println(obj1.rno+"\n"+obj1.sname+"\n"+obj1.fees);
		
		//we can get value of fee by obj.fees , but obj1 is after Deserialization object.
		
		oi.close();
	}

}
