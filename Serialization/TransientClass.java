package Serialization;

import java.io.Serializable;

public class TransientClass implements Serializable{
	
	int rno;
	String sname;
	transient int fees;
	
	public TransientClass(int r,String sn,int fe)
	{
		this.rno=r;
		this.sname=sn;
		this.fees=fe;
	}

}
