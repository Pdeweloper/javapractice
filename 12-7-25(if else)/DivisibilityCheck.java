import java.util.Scanner;

class DivisibilityCheck
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num%3==0)
			System.out.print("Divisibile by 3 , ");
		
		if(num%3==0 && num%5==0)
			System.out.print("Divisibile by 5 , ");
		
		if(num%3==0 && num%5==0 && num%9==0)
			System.out.print("Divisibile by 9");
		
		if(num%3==0 && num%9==0)
			System.out.print("Divisibile by 9");
		
		if(num%5==0)
			System.out.print("Divisibile by 5");
	}
}