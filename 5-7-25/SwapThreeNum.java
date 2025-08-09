class SwapThreeNum
{
public static void main(String args[])
{
int a=2,b=4,c=6,temp;

System.out.println("Before Swap : ");
System.out.println("a : "+a);
System.out.println("b : "+b);
System.out.println("c : "+c);

temp=a;
a=b;
b=c;
c=temp;

System.out.println("After Swap : ");
System.out.println("a : "+a);
System.out.println("b : "+b);
System.out.println("c : "+c);

}
};