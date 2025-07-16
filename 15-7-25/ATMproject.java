import java.util.Scanner;

class ATMproject
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter Pin : ");
String code = s.next();

int balance = 12000;
String pin = "5261";
char op='n';

if(code.equals(pin))
{
System.out.println("Select Option : ");
System.out.println("C-Credit");
System.out.println("D-Debit");
System.out.println("B-Balance Check");
op = s.next().charAt(0);
}
else
{
System.out.println("Incorrect Pin , Enter correct Pin");
}

if(op=='C' || op=='c')
{
 System.out.print("Enter Amount : ");
 balance+=s.nextInt();
 System.out.println("Your amount is credited in your Amount...");
System.out.print("Total Balance is : "+balance);

}
else if(op=='D' || op=='d')
{
 System.out.print("Enter Amount : ");
 balance-=s.nextInt();
 System.out.println("Your amount is debited in your Amount...");
System.out.print("Total Balance is : "+balance);
}
else if(op=='B' || op=='b')
{
System.out.print("Total Balance is : "+balance);
}
else
{
System.out.print("Enter Valid Option...");
}


}
}