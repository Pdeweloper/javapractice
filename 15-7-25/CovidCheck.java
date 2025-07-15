import java.util.Scanner;

class CovidCheck
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter Your Covid Result : ");

String result = s.next();

if(result.equals("Positive"))
{
System.out.print("Your are Quarantine for 15 days");
}

}
}