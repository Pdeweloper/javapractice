class AddComplexNums
{
public static void main(String args[])
{
int a=2,b=4;
int c=6,d=8;

System.out.println("First Complex Numbers : "+a+"+"+b+"i");
System.out.println("Second Complex Numbers : "+c+"+"+d+"i");

int realsum = a+c;
int imgsum = b+d;

System.out.print("After Addition Complex number is : ");
System.out.print(realsum+"+"+imgsum+"i");

}
}