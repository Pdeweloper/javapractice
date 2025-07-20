import java.util.Scanner;

class DecimalToBinary
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Decimal Number : ");
int n = sc.nextInt();

int temp = n;
int rem;
String s = "";

for(;temp!=0;)
{
rem = temp%2;
s = s+rem;
temp = temp/2;
}
s+="0";

StringBuilder bin = new StringBuilder(s);
bin.reverse();

System.out.print("Binary of "+n+" is : "+bin);

}
}