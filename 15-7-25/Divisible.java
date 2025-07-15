import java.util.Scanner;

class Divisible
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = s.nextInt();

String result = "";

if(n%3==0)
{
result +="Divisible by 3 , ";
}

if(n%5==0)
{
result+="Divisible by 5 , ";
}

if(n%9==0)
{
result+="Divisible by 9 , ";
}

if(result=="")
{
result += "It is not divisible by any";
}

System.out.print(result);

}
}