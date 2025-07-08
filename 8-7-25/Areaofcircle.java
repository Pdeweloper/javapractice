class Areaofcircle
{
public static void main(String args[])
{
float r = Float.parseFloat(args[0]);
final float PI = 3.14f;

double Area = PI*(r*r);

String starea = ""+Area;
System.out.println("Radius is : "+r);
System.out.print("Area of circle : "+starea);

}
}