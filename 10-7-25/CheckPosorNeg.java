class CheckPosorNeg
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
//int num = 5;

String check = (num<0)?"Number is negative" : ((num>=0) ? "Number is Positive" : "Invalid Input");

System.out.print(check);

}
}