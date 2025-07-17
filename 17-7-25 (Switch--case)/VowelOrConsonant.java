class VowelOrConsonant
{
public static void main(String...x)
{
char ch = 'p';

switch(ch)
{
  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u':
  case 'A':
  case 'E':
  case 'I':
  case 'O':
  case 'U':
   System.out.print("Vowel...");
   break;
 default:
   System.out.print("Consonant");
   break;

}

}
}