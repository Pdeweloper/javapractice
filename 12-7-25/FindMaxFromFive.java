class FindMaxFromFive
{
public static void main(String args[])
{
int a=1,b=2,c=3,d=4,e=5;
char ch;

if(a>b)
{
  if(a>c)
  {
     if(a>d)
     {
        if(a>e)
        {ch='a'; }
        else
        { ch='e'; }
     }
     else
     { if(d>e)
       { ch = 'd'; }
       else
       { ch = 'e'; }
     }
  }
  else
  {
   if(a>d)
   {
     if(a>e)
     {ch='a';}
     else
     {ch = 'e';}  
   }
   else
   {  if(d>e)
      { ch = 'd'; }
      else
      { ch = 'e'; }
   }
  }
}
else
{
   if(b>c)
   { 
      if(b>d)
      {
         if(b>e)
         { ch = 'b';}
         else
         { ch = 'e';}
      }
      else
      {
         if(d>e)
         { ch = 'd';}
         else
         { ch = 'e';}
      }

   }
   else
   {
      if(c>d)
      {
         if(c>e)
         { ch = 'c';}
         else
         { ch = 'e';}

      }
      else
      {
         if(d>e)
         { ch = 'd';}
         else
         { ch = 'e';}
      }
   }  
}

System.out.print(ch+" has maximum value");

}
}


class FindMaxFromFiveOptimized
{
public static void main(String args[])
{
int a=1,b=2,c=7,d=6,e=5;
int max = a;
char ch = 'a';

if(b>max){
max = b;
ch = 'b';
}
if(c>max){
max = c;
ch = 'c';
}
if(d>max){
max = d;
ch = 'd';
}
if(e>max){
max = e;
ch = 'e';
}

System.out.print(ch+" has maximum value");
}
}
 