package Thread;

/*
public class Table {

	synchronized public void displayTable(int num) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			Thread.sleep(100);
		}
	}
}
*/

//using wait() method.
public class Table {

	 public void displayTable(int num) throws InterruptedException
	{
		 synchronized (this) {
			 for(int i=1;i<=10;i++)
				{
					System.out.println(num*i);
					if(i>5)
					{
						//after wait called , process become asynchronize.
						wait(1000);
						notify();
					}
					Thread.sleep(200);
				}
		}
	}
}
