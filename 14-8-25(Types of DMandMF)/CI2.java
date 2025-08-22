import java.util.Scanner;

class CI2
{
	private float rt;
	private int T;
	private int P;
	private int n;
	private double comp;
	
	Scanner sc = new Scanner(System.in);
	
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
	
	//Function without parameter + (double)return type.
	double calComInt()
	{
		float R1 = rt/100f;

        double a = Math.pow((1+(R1/n)),n*T);
        double A = P*a;

        comp = A-P;
		
		return comp;//returning result.
	}
}