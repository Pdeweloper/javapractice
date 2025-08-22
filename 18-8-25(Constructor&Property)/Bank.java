//banking System by Oops concept.

import java.util.Scanner;

class Bank
{
	static int bal = 12000;
	
	Scanner sc = new Scanner(System.in);
	private void credit(int amt)
	{
		bal = bal+amt;
		System.out.println("Credited Successfuly...\n");
	}
	private void debit(int amt)
	{
		bal = bal-amt;
		System.out.println("Debited Successfuly...\n");
	}
	private void checkbal()
	{
		System.out.println("Balance : "+bal);
		System.out.println();
	}
	
	private int accept()
	{
		System.out.print("Enter Amount : ");
		int amt = sc.nextInt();
		
		return amt;
	}
	
	void login(int pin)
	{
		if(pin==1324)
		{
			while(true)
			{
				System.out.print("Enter your option : \nc-credit\nd-debit\nb-check balance\ne-exit\n");
				char ch = sc.next().charAt(0);
				
				switch(ch)
				{
					case 'c':
					credit(accept()); //here we call accept() which return amount.
					break;
					
					case 'd':
					debit(accept());
					break;
					
					case 'b':
					checkbal();
					break;
					
					case 'e':
					System.exit(0);
					break;
					
					default:
					System.out.println("Enter valid option.\n");
					break;
				}
			}
		}
		else
		{
			System.out.print("Wrong PIN , Try again...");
		}
	}
}
				
	