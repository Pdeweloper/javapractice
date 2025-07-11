class Leapyear
{
public static void main(String args[])
{
int year = Integer.parseInt(args[0]);
//int year = 2016;

String check = (year%4==0)?((year%100!=0)?"Leap Year":"Not leap Year"):((year%400==0)?"Leap Year":"Not leap Year");

System.out.print(check);

}
}