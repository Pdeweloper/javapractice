import java.util.Scanner;

class Vowel
{
public static void main(String...args)
{
Scanner  s = new Scanner(System.in);
System.out.print("Enter Character : ");

char ch1 = s.next().charAt(0);
int asc = ch1;
char ch = (char)((asc>=65 && asc<=90)?asc+=32 :asc);
String result="";

if(ch=='a')
{
result = "Vowel";
}
else if(ch=='e')
{
result = "Vowel";
}
else if(ch=='i')
{
result = "Vowel";
}
else if(ch=='o')
{
result = "Vowel";
}
else if(ch=='u')
{
result = "Vowel";
}
else
{
result = "Consonant";
}

System.out.print(result);

}
}