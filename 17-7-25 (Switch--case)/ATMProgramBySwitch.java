import java.util.Scanner;

class ATMProgramBySwitch
{
public static void main(String...arg)
{
int balance = 12000;
String pin = "1234";

Scanner s = new Scanner(System.in);
System.out.print("Enter Pin : ");
String code = s.next();

Object o = code.equals(pin);
char op='a';

switch(o.toString())
{
    case "true":
      System.out.println("Select Option - ");
      System.out.println("B-Check Balance\nC-Credit\nD-Debit");
      System.out.print("Your Option : ");
      op = s.next().charAt(0);
      break;
   default:
     System.out.print("Invalid Option , Select correct Option");
     break;
}    

switch(op)
{ 
    case 'b':
    case 'B':
       System.out.print("Total Balance : "+balance); 
       break;

    case 'c':
    case 'C':
       System.out.print("Enter Amount : ");
       balance+=s.nextInt();
       System.out.print("Your Amount is credited.");
       System.out.print("Total Balance : "+balance); 
       break;

    case 'd':
    case 'D':
       System.out.print("Enter Amount : ");
       balance-=s.nextInt();
       System.out.print("Your Amount is debited.");
       System.out.print("Total Balance : "+balance); 
       break;
}

}
}