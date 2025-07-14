class GraceMark
{
public static void main(String args[])
{
int mark = 29;
int finalmark = mark;
int grace=0;

if(mark<33 && mark>=28)
{
 grace = 33-mark;
 finalmark = mark + grace;
 System.out.println("Mark is "+mark);
 System.out.println("After add "+grace+" marks of grace");

}

System.out.println("Final Mark is : "+finalmark);
}
}