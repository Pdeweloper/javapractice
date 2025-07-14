class LeapYear
{
public static void main(String []args)
{
int year = 2020;

if(year%4==0)
{  
  if(year%100!=0)
  { System.out.print(year+" is Leap Year.");
  }
  else
  {  System.out.print(year+" is not Leap Year.");
  }
}
else 
{ if(year%400==0)
  {System.out.print(year+" is Leap Year.");}
  else
  { System.out.print(year+" is not Leap Year.");}
}

}
}