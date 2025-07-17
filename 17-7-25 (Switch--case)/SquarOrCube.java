class SquarOrCube
{
public static void main(String args[])
{
int n = 3;
double cal;

switch(n%2)
{
     case 0:
       System.out.println("Number is EVEN");
       cal = Math.pow(n,2);
       System.out.print("Square of Number is "+cal);
       break;
 
     default:
       System.out.println("Number is ODD");
       cal = Math.pow(n,2);
       System.out.print("Square of Number is "+cal);
       break;
}

}
}