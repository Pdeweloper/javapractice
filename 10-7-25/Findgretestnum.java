class Findgretestnum
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);

//int a=10,b=20,c=30;

char big = (a>b) ? ((b>c)? 'a' : ((c>a) ? 'c' :'a')) : ((b>c) ? 'b' : '@') ;

System.out.print(big + " has Greater value ");

}
}