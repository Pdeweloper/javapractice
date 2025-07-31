class DisplayPalandromStringArray
{
public static void main(String...x)
{
String sarr[]={"nitin","ama","Japan","madam"};

for(int i=0;i<sarr.length;i++)
{
   String s=sarr[i];
   String result="";

   for(int j=s.length()-1;j>=0;j--)
   {
      result+=s.charAt(j);
   }
  
   if(result.equals(s))
    System.out.println(result);
}

}
}