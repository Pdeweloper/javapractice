class BinaryToDecimal
{
public static void main(String args[])
{
String n = "10110";
int rem,add=0;
int lgt = n.length()-1;

for(int i=lgt ; i>=0 ; i--)
{
   rem = (int)n.charAt(i) - '0';  //Converting char(string's one char) into int

   add+=(rem*Math.pow(2,(lgt-i))); //adding all
} 

System.out.print("Decimal of "+n+" is : "+add);

}
}