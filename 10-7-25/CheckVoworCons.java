class CheckVoworCons
{
public static void main(String args[])
{
char ch = 'Z';

String check = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Character is Vowel" : ((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')? "Character is Vowel" : "Character is Consunent");

System.out.print(check);

}
}