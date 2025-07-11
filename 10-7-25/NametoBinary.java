class NametoBinary
{
public static void main(String args[])
{
String name = "Prajwal"; 
char ch;
String ans = "";
int ascii;

int qua,rem;

for(int i=0;i<name.length();i++)
{
ch = name.charAt(i);
ascii = ch;
qua = ascii;
   while(qua!=0)
   {
       rem = qua%2;
       ans+=rem;
       qua=qua/2;
   }  
   ans+="-";
}

StringBuilder sb = new StringBuilder(ans);
sb.reverse();
ans = sb.toString();


System.out.print(ans);

}
}