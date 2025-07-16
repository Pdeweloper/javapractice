import java.util.Scanner;

class FindMiddleValue
{
public static void main(String []args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a = ");
int a = s.nextInt();

System.out.print("Enter b = ");
int b = s.nextInt();

System.out.print("Enter c = ");
int c = s.nextInt();

if(a>b && c>a || a<b && c<a)
{
System.out.print("Value of a "+a+" is middle");
}
else if(b>a && c>b || b<a && c<b)
{
System.out.print("Value of b "+b+" is middle");
}
else if(c>a && b>c || c<a && b<c)
{
System.out.print("Value of c "+c+" is middle");
}
else
{
System.out.print("All are equal");
}

}
}
