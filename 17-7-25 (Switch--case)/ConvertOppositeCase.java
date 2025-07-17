class ConvertOppositeCase
{
public static void main(String...x)
{
char ch = 'a';
int asc = ch;

Object o = asc>=65 && asc<=90;
Object o1 = asc>=97 && asc<=122;

switch(o.toString())
{
    case "true":
      asc = asc+32;
      System.out.print("Opposite case of "+ch+" is "+(char)asc);
      break;
    default:
        switch(o1.toString())
        {
            case "true":
              asc = asc-32;
              System.out.print("Opposite case of "+ch+" is "+(char)asc);
              break;
            default:
              System.out.print("Character is not alphabet");
        }

}

}
}