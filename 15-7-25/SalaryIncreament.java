import java.util.Scanner;

class SalaryIncreament
{
public static void main(String []args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter your salary : ");

int salary = s.nextInt();

if(salary<10000)
{
salary+=500;
}

System.out.print("Your Actual salary is : "+salary);

}
}