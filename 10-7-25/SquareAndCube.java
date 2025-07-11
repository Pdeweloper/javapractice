class SquareAndCube
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
//int n = 2;

double cal = (n%2==0) ? Math.pow(n,2) : Math.pow(n,3);
String check = (n%2==0) ? "EVEN and Square is " : "ODD and Cube is ";

System.out.print("Number is : "+check+cal);

}
}
