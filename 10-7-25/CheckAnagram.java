class CheckAnagram
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);

int count=1;
int rem,rem1,temp=b,temp1=a;

for(int j=0;j<=2;j++){
rem = temp1%10;

for(int i=0;i<=2;i++)
{
  rem1 = temp%10;
  if(rem==rem1){
  count++;
  break;
  }
  else{
   temp = temp/10;
  }
}
temp1 = temp1/10;
}

if(count==3){
System.out.print("They are Anagram.");
}
else
{
System.out.print("They are not Anagram.");
}

}
}