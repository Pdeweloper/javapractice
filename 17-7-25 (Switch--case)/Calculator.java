import java.util.Scanner;

class Calculator
{
public static void main(String...x)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter two integer number. ");
System.out.print("First number : ");
int a = s.nextInt();

System.out.print("Second number : ");
int b = s.nextInt();

System.out.println("Choose Your Option -");
System.out.print("A-Addition\nS-Subtraction\nD-Division\nM-Multiplication\nYour Option is : ");

char ch = s.next().charAt(0);
double result;

switch(ch)
{
   case 'a':
   case 'A':
     result = a+b;
     System.out.print("Addition is = "+result);
     break;
   case 's':
   case 'S':
     result = a-b;
     System.out.print("Subtraction is = "+result);
     break;
   case 'm':
   case 'M':
     result = a*b;
     System.out.print("Multiplication is = "+result);
     break;
   case 'd':
   case 'D':
     result = a/b;
     String formattedString = String.format("%.6f", result);
     System.out.print("Division is = "+formattedString);
     break;
   default:
     System.out.print("Invalid Choice , Choose correct option...");
     break;
}

}
}