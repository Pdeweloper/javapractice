class FindGreatest
{
public static void main(String args[])
{
int a=10,b=20,c=30;
char ch;

if(a>b)
{
  if(a>c)
  {
    ch = 'a';
  }
  else
  {
    ch = 'c';
  }
}
else
{
  if(b>c)
  {
    ch = 'b';
  }
  else
  {
    ch = 'c';
  }
}

System.out.print("Greatest is : "+ch);

}
}