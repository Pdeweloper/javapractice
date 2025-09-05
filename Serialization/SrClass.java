package Serialization;

import java.io.*;
public class SrClass implements Serializable{

	int rno;
	String sname;
	
	public SrClass(int r,String sn)
	{
		this.rno=r;
		this.sname=sn;
	}

}
