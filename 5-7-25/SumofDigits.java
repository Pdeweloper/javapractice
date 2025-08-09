class SumofDigits
{
public static void main(String args[])
{
int num = 786;

int rem,sum=0;

while(num>0)
{
rem = num%10;
sum+=rem;
num = num/10;
}

System.out.print("Sum of three digits of a number is : "+sum);

}
}