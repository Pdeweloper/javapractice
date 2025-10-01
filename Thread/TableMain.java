package Thread;

public class TableMain {

	public static void main(String[] args) {
		
		Table tb = new Table();
		
		TableThread1 t1 = new TableThread1(tb);
		t1.start();
		
		TableThread2 t2 = new TableThread2(tb);
		t2.start();

	}

}
