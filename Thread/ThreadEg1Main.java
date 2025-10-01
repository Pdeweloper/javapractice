package Thread;

public class ThreadEg1Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		ThreadEg1 t = new ThreadEg1();
		t.start();
		ThreadEg1 t1 = new ThreadEg1();
		t1.start();
		*/
		
		//Using join method
		ThreadEg1 t = new ThreadEg1();
		t.start();
		t.join();
		//join method monitor 1st thread.
		//after complete 1st thread , it start 2nd thread.
		
		ThreadEg1 t1 = new ThreadEg1();
		t1.start();
		
	}

}
