class ReversNumDigits
{
public static void main(String args[])
{
int num = 901;
int rem,sum=0;

System.out.println("Before Revers Number is : "+num);

rem = num%10;
sum = (sum*10)+rem;
num = num/10;

rem = num%10;
sum = (sum*10)+rem;
num = num/10;

rem = num%10;
sum = (sum*10)+rem;
num = num/10;

System.out.print("After Revers Number is : "+sum);


}
}