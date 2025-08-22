import java.util.Scanner;

class ReturnMultiValueMain
{
	public static void main(String...x)
	{
		ReturnMultiValue obj = new ReturnMultiValue();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eeter first(int) number : ");
		int a=sc.nextInt();
		
		System.out.print("Eeter Second(int) number : ");
		int b=sc.nextInt();
		
		obj.getdata(a,b);
		obj.add();
		obj.sub();
		obj.mult();
		
		int arr[] = obj.returnarr();
		
		System.out.println("SUM is : "+arr[0]);
		System.out.println("SUBTRACTION is : "+arr[1]);
		System.out.println("MULTIPLICATION is : "+arr[2]);
	}
}
		