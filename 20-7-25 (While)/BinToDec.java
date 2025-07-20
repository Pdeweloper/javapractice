import java.util.Scanner;

class BinToDec
{
public static void main(String...arg)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter a Binary number : ");
String bin = c.next(); 
int lgt = bin.length()-1;
int add=0;
int i=lgt;
while(i>=0)
{
  int temp = bin.charAt(i)-'0';
  add+=temp*(Math.pow(2,(lgt-i)));
  i--;
}

System.out.print("Decimal of "+bin+" is : "+add);

}
}