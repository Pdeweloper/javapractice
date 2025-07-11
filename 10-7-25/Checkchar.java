class Checkchar
{
public static void main(String args[])
{
char ch = '3'; 
int ascii = ch;

String check = (ascii>=48 && ascii<=57) ? "Character is numeric": ((ascii>=65 && ascii<=90) ? "Character is Upper Alphabet" : ((ascii>=97 && ascii<=122) ? "Character is Lower Alphabet" : "Character is Other type"));

System.out.print(check);

}
}