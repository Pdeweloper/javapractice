import java.util.Scanner;

class CompIntMain
{
	public static void main(String...x)
	{
		
		//without parameter + no return type.
		/*
		CI1 obj = new CI1();
		
		obj.accept();
		obj.calComInt();
		obj.display();
		*/
		
//---------------------------------------------------------------------------------------
		
		//without parameter + (double)return type.
		/*
		CI2 obj = new CI2();
		obj.accept();
		
		//here we are storing result that is return by calComInt() function.
		double compInt = obj.calComInt();
		
		System.out.println();
		System.out.print(String.format("Compound Intrest : Rs.%.0f ",compInt));
		System.out.println();
		*/
		
//----------------------------------------------------------------------------------------
		
		//Function with parameter + no return type.
		/*
		Scanner sc = new Scanner(System.in);
		
		CI3 obj = new CI3();
		
		System.out.print("Enter Principal Amount : ");
		int P = sc.nextInt();
		
		System.out.print("Enter Rate : ");
		float rt = sc.nextFloat();
		
		System.out.print("Enter Time(in year) : ");
		int T = sc.nextInt();
		
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		obj.calCompInt(P,rt,T,n);
		obj.display();
		*/
		
//----------------------------------------------------------------------------------------

        //with parameter + (double)return type.
		CI4 obj = new CI4();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principal Amount : ");
		int P = sc.nextInt();
		
		System.out.print("Enter Rate : ");
		float rt = sc.nextFloat();
		
		System.out.print("Enter Time(in year) : ");
		int T = sc.nextInt();
		
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		double compInt = obj.calCompInt(P,rt,T,n);
		
		System.out.println();
		System.out.print(String.format("Compound Intrest : Rs.%.0f ",compInt));
		System.out.println();
	}
}
