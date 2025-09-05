import java.util.Scanner;

class AllExceptionExample
{
	public static void main(String...x)
	{
		try
		{
			int arr[] = {1,2};
			
			//it will give ArrayIndexOutOfBoundsException() Exception.
			//because we are accessing index which is not exist.
			System.out.println(arr[2]);
			
			//this will give NullPointerException() Exception.
			Scanner sc1 = null;
			
			//if input is not given integer , it will give NumberFormatException().
			//if value of "b" given "0" , it will give ArithmeticException().
			Scanner sc = new Scanner(System.in);
			System.out.print("A is : ");
			int a = sc.nextInt();
			System.out.print("B is : ");
			int b = sc.nextInt();
			
			int c = a/b;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception : Index is not Present");
		}
		catch(NullPointerException ex)
		{
			System.out.println("Exception : Object must not null");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Exception : Enter Only Integer Value");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception : Dinominator should not 0.");
		}
	}
}