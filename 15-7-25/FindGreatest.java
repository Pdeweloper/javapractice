import java.util.Scanner;

class FindGreatest
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a = ");
int a = s.nextInt();

System.out.println("Enter b = ");
int b = s.nextInt();

System.out.println("Enter c = ");
int c = s.nextInt();



String result;

if(a>b && a>c)
{
result="a is greatest";
}
else if(b>c)
{
result = "b is greatest";
}
else
{
result = "c is greatest";
}

System.out.print(result);

}
}