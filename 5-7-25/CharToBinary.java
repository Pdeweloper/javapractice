class CharToBinary
{
public static void main(String args[])
{
char ch='B';
int bi = ch;

int rem,qua=bi;
String ans = "";


while(qua>0)
{
rem = qua%2;
ans+=rem;
qua = qua/2;
}

StringBuilder sb = new StringBuilder(ans);
sb.reverse();
ans = sb.toString();
System.out.print(ans);

}
}