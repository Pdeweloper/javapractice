class CheckDivisibility
{
public static void main(String...x)
{
int n = 9;

switch(n%3)
{
   case 0:
     switch(n%5)
     {
        case 0:
          switch(n%9)
          {
             case 0:
               System.out.println("Number : "+n);
               System.out.print("Divisible by 3 , Divisible by 5 , Divisible by 9");
               break;
             default:
               System.out.println("Number : "+n);
               System.out.print("Divisible by 3 , Divisible by 5");
               break;
          }
          break;

        default:
          System.out.print("Number : "+n);
          System.out.print("Divisible by 3");
          break;
     }
     break;

  default:
    System.out.println("Number : "+n);
    System.out.print("Not Divisible by Any...");
    break;
}

}
}