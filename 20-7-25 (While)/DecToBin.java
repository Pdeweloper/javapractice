import java.util.Scanner;

class DecToBin
{
public static void main(String...arg)
{
Scanner c = new Scanner(System.in);
System.out.print("Enter a Integer Number : ");
int n=c.nextInt();
int temp=n;
String s="";

while(temp!=0)
{
    int rem = temp%2;
    s+=rem;
    temp = temp/2;
}

s+="0";
StringBuilder sb = new StringBuilder(s);
sb.reverse();

System.out.print("Binary of "+n+" is : "+sb);

}
}