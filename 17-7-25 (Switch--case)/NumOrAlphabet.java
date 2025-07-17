class NumOrAlphabet 
{
public static void main(String x[])
{
char ch = 'a';
int asc = ch;

switch(asc)
{
  case '0':
  case '1':
  case '2':
  case '3':
  case '4':
  case '5':
  case '6':
  case '7':
  case '8':
  case '9':
    System.out.print("Char is number");
    break;
  default:
    System.out.print("Char is Alphabet");
    break;
    
}

}
}

//------------------------------------------------------------------------------------------------

class NumOrAlphabetUpdated
{
public static void main(String...args)
{
char ch = 'a';
int asc = ch;

Object o = asc>=48 && asc<=57; //for numeric;
Object o1 = asc>=65 && asc<=90; //for Upper case;
Object o2 = asc>=97 && asc<=122; //for Lower case;

switch(o.toString().charAt(0))
{
    case 't':
      System.out.print(ch+" Character is Numeric...");
      break;
   
   default: 
      switch(o1.toString().charAt(0))
      {
          case 't':
            System.out.print(ch+" Character is Upper Alphabet...");
            break;
          default:
              switch(o2.toString().charAt(0))
              {
                 case 't':
                   System.out.print(ch+" Character is Lower Alphabet...");
                   break;
                 default:
                   System.out.print("Character is other type...");
                   break;
              }
              break;  
      }
}


}
}

