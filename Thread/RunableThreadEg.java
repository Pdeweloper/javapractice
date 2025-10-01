package Thread;

/*
public class RunableThreadEg implements Runnable {

	public RunableThreadEg()
	{
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Process "+i+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

//Now we can use feature of parent class in thread
/*
public class RunableThreadEg extends ParentClass implements Runnable {

	public RunableThreadEg()
	{
		Thread t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		try 
		{
		 for(int i=1;i<=10;i++)
		 {
			System.out.println("Process "+i+Thread.currentThread().getName());
			Thread.sleep(500);
			super.fun();
		 }
		}
		catch(InterruptedException ex)
		{
			ex.addSuppressed(ex);
		}
	}
}
*/

//without start() method what happen
//ye heap memory me run hoga , ye thread nahi banega , 
//ye init state me hi rahega.
public class RunableThreadEg implements Runnable {

	public RunableThreadEg()
	{
		Thread t = new Thread(this);
		t.run();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Process "+i+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

