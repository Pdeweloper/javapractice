import java.util.Scanner;

class Custumer
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		
		Bank obj = new Bank();
		
		System.out.print("Enter PIN : ");
		int pin = sc.nextInt();
		
		obj.login(pin);
	}
}