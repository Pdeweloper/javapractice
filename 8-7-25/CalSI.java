class CalSI
{
public static void main(String args[])
{
Object P = 10000,T = 2;
double rt = 6.5;

System.out.println("Principle Amount : "+P);
System.out.println("Rate : "+rt);
System.out.println("Time(in year) : "+T);

double SI = ((int)P*rt*(int)T)/100;

System.out.print("Simple intrest is : "+SI);


}
}