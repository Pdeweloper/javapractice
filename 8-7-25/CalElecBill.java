class CalElecBill
{
public static void main(String args[])
{
int unprice = Integer.parseInt(args[0]);
int consum = Integer.parseInt(args[1]);

System.out.println("Unit Price : "+unprice);
System.out.println("Comsumed : "+consum+"kwh");

int bill = unprice*consum;

System.out.print("Total Bill is : "+bill);
}
}