import java.util.Scanner;

class AnagramCheck
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit number1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 3 digit number2 : ");
		int n2 = sc.nextInt();
		
		int temp1=n1;
		int count=0;
		for(int i=0;i<3;i++)
		{
			int rem = temp1%10;
			int temp2 = n2;
			for(int j=0;j<3;j++)
			{
				int rem1 = temp2%10;
				if(rem1==rem)
				{
					count++;
					break;
				}
				else
					temp2 = temp2/10;
			}
			temp1 = temp1/10;
		}
		
		if(count==3)
			System.out.print("Numbers are Anagram...");
		else
			System.out.print("Numbers are not Anagram...");
	}
}