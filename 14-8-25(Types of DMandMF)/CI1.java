import java.util.Scanner;

class CI1
{
	private float rt;
	private int T;
	private int P;
	private int n;
	private double comp;
	
	Scanner sc = new Scanner(System.in);
	
	//Function without parameter + no return type.
	void accept()
	{
		System.out.print("Enter Principal Amount : ");
		P = sc.nextInt();
		
		System.out.print("Enter Rate : ");
		rt = sc.nextFloat();
		
		System.out.print("Enter Time(in year) : ");
		T = sc.nextInt();
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
	}
	
	void calComInt()
	{
		float R1 = rt/100f;

        double a = Math.pow((1+(R1/n)),n*T);
        double A = P*a;

        comp = A-P;
	}
	
	void display()
	{
		System.out.println();
		System.out.print(String.format("Compound Intrest : Rs.%.0f ",comp));
		System.out.println();
	}
}
		