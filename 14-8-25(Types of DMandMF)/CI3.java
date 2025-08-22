class CI3
{
	private float rt;
	private int T;
	private int P;
	private int n;
	private double comp;
	
	//Function with parameter + no return type.
	void calCompInt(int P,float rt,int T,int n)
	{
		this.P=P;
		this.rt=rt;
		this.T=T;
		this.n=n;
		
		float R1 = rt/100f;

        double a = Math.pow((1+(R1/n)),n*T);
        double A = P*a;

        this.comp = A-P;
		
	}
	
	void display()
	{
		System.out.println();
		System.out.print(String.format("Compound Intrest : Rs.%.0f ",compInt));
		System.out.println();
	}
}
	
	