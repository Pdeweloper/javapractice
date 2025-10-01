package Thread;

public class ThreadEg1 extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Process "+i+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
