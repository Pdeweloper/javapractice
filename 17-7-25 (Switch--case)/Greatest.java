class Greatest
{
public static void main(String[]x)
{
int a=1,b=20,c=3;

switch(a/b)
{
   case 0:
        switch(b/c)
        {
            case 0:
              System.out.print("c is Greatest");
              break;
            default:
              System.out.print("b is Greatest");
              break;
        }
        break;
   default:
       switch(a/c)
       {
            case 0:
              System.out.print("c is Greatest");
              break;
            default:
              System.out.print("a is Greatest");
              break;
       }
       break;
}

}
}