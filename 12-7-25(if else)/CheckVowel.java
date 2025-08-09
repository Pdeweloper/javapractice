class CheckVowel
{
public static void main(String args[])
{
char ch = 'p';
String lower = "aeiou";
String Upper = "AEIOU";
String result = "Consonent";

if(ch==lower.charAt(0))
{
   result = "Vowel";
}
if(ch==lower.charAt(1))
{
   result = "Vowel";
}
if(ch==lower.charAt(2))
{
   result = "Vowel";
}
if(ch==lower.charAt(3))
{
   result = "Vowel";
}
if(ch==lower.charAt(4))
{
   result = "Vowel";
}

if(ch==Upper.charAt(0))
{
   result = "Vowel";
}
if(ch==Upper.charAt(1))
{
   result = "Vowel";
}
if(ch==Upper.charAt(2))
{
   result = "Vowel";
}
if(ch==Upper.charAt(3))
{
   result = "Vowel";
}
if(ch==Upper.charAt(4))
{
   result = "Vowel";
}

System.out.print("Character is : "+result);

}
}

//----------------------------------------------------------------------------------------

class CheckVowelOptimized
{
public static void main(String args[])
{
char ch = 'z';
String lower = "aeiou";
String upper = "AEIOU";
String result = "Consonent";

if(lower.indexOf(ch)!=-1)
{
  result = "Vowel";
}

if(upper.indexOf(ch)!=-1)
{
  result = "Vowel";
}

System.out.print("Character is : "+result);

}
}

