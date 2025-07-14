class ConvertCharIntoOppositeCase
{
public static void main(String args[])
{
char ch = 'j';
int ascii = ch;
int result = 0;

if(ascii>=65 && ascii<=90)
{
result = ascii+32;
}
else if(ascii>=97 && ascii<=122)
{
result = ascii-32;
}
else
{System.out.print("Character is not Alphabet");}

System.out.println("Character is : "+ch);
System.out.print("Opposite Case is : "+(char)result);

}
}