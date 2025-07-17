class LeapYear
{
public static void main(String[]x)
{
int y = 2020;

switch(y%4)
{
  case 0:
      switch(y%100)
      { 
         case 0:
           System.out.print(y+" is not leap Year");
           break;
         default:
           System.out.print(y+" is Leap Year");
           break;
      }
  break;
  default:
     switch(y%400)
     {
         case 0:
           System.out.print(y+" is Leap Year");
           break;
         default:
           System.out.print(y+" is not Leap Year");
           break;
     }
}

}
}