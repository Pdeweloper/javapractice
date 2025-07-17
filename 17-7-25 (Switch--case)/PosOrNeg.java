class PosOrNeg
{
public static void main(String...x)
{
int n = -5;

Object o = n>=0; //true if +ve

switch(o.toString())
{
  case "true":
    System.out.print(n+" is Positive Number");
    break;
  default:
    System.out.print(n+" is Negative");
    break;
}

}
}