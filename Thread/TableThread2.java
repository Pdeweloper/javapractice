package Thread;

public class TableThread2 extends Thread {

	Table t;
	public TableThread2(Table t) {
		
		this.t=t;
	}
	
	public void run() 
	{
		try {
			t.displayTable(9);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
