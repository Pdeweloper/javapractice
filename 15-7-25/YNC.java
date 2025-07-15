import java.util.Scanner;

class YNC
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter y ,n and c : ");
char ch = s.next().charAt(0);

if(ch=='y')
{
System.out.print("YES");
}
else if(ch=='n')
{
System.out.print("NO");
}
else if(ch=='c')
{
System.out.print("CANCEL");
}
else
{
System.out.print("Invalid Character");
}

}
}