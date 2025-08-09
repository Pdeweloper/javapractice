import java.util.Scanner;

class ReverseTheNumber
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a more than 1 digit number : ");
		int n=sc.nextInt();
		String rev = "";
		
		while(n!=0)
		{
			rev+=n%10;
			n=n/10;
		}
		
		System.out.print("Reverse is : "+rev);
	}
}
