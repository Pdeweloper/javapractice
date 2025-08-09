import java.util.Scanner;

class ReverseNum
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a more than 1 digit number : ");
		int n = sc.nextInt();
		String rev = "";
		for(int i=n;i>0;)
		{
			int rem = i%10;
			rev+=rem;
			i = i/10;
		}
		
		System.out.print("Reverse is : "+rev);
	}
}