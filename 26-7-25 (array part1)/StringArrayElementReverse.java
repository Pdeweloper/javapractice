class StringArrayElementReverse
{
public static void main(String...x)
{
String sarr[] = {"India","China","Japan","Butan"};

for(int i=0;i<sarr.length;i++)
{
   String s=sarr[i];
   String result="";
   for(int j=s.length()-1;j>=0;j--)
   {
       result+=s.charAt(j);
   }
  System.out.println(result);
}

}
}

//------------------------------------------------------------------------------------------------------

class PrintReverseStringArray
{
public static void main(String...x)
{
String sarr[]={"India","China","Japan","Butan"};

for(int i=sarr.length-1;i>=0;i--)
{
   System.out.println(sarr[i]);
}

}
}