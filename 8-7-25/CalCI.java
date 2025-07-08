class CalCI
{
public static void main(String args[])
{
Object rt=5,T=3;
float P = 1000.0F,n=1;

double rt1 = (int)rt/100;
int T1 = (int)T*(int)n;

System.out.print(T1+" "+rt1);

double A = P*(Math.pow((1+(rt1/n)),T1));

//double A = 1000*(Math.pow((1+(0.05/1)),3));
//double CI = A-P;

//System.out.print("Compound Intrest is : "+A);

}
}