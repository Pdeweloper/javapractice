class SquareOrCube
{
public static void main(String args[])
{
int n = 5;
String check;
double cal;

if(n%2==0)
{
 check = "EVEN";
 cal = Math.pow(n,2);
System.out.println("Square of "+ n +" is  : "+cal);
}
else
{
check = "ODD";
cal = Math.pow(n,3);
System.out.println("Cube of "+ n +" is  : "+cal);
}

System.out.println("Because Number is : "+check);

}
}