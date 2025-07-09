class CalCI
{
public static void main(String args[])
{
Object rt=5,T=3;
float P = 1000.0F,n=1;

int R = (int)rt;
int t = (int)T;

float R1 = R/100f;

double a = Math.pow((1+(R1/n)),n*t);
double A = P*a;

double CI = A-P;

//double A = 1000*(Math.pow((1+(0.05/1)),3));
//double CI = A-P;

System.out.print("Compound Intrest is : "+CI);

}
}
