class MulofComplexnums
{
public static void main(String args[])
{

int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int d = Integer.parseInt(args[3]);

int real = (a*c - b*d);
int imagi = (a*d + b*c);

System.out.println("First Complex No. is : "+a+"+"+b+"i");
System.out.println("Second Complex No. is : "+c+"+"+d+"i");

System.out.print("Multiplication is : "+real+"+"+imagi+"i");

}
}