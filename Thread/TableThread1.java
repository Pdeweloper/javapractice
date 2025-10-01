package Thread;

public class TableThread1 extends Thread {

	Table t;
	public TableThread1(Table t) {
		
		this.t=t;
	}
	
	public void run() 
	{
		try {
			t.displayTable(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
