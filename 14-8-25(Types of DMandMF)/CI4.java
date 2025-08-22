class CI4
{
	private float rt;
	private int T;
	private int P;
	private int n;
	private double comp;
	
	//Function with parameter + (double)return type.
	double calCompInt(int P,float rt,int T,int n)
	{
		this.P=P;
		this.rt=rt;
		this.T=T;
		this.n=n;
		
		float R1 = rt/100f;

        double a = Math.pow((1+(R1/n)),n*T);
        double A = P*a;

        this.comp = A-P;
		
		return comp; //returning result.
	}
}