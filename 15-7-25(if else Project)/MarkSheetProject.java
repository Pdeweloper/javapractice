import java.util.Scanner;

class MarkSheetProject
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter Maths marks : ");
int mt = s.nextInt();

System.out.print("Enter Physics marks : ");
int ph = s.nextInt();

System.out.print("Enter Chemistry marks : ");
int ch = s.nextInt();

System.out.print("Enter Hindi marks : ");
int hi = s.nextInt();

System.out.print("Enter English marks : ");
int eg = s.nextInt();

if((mt>=0&&mt<=100)&&(ph>=0&&ph<=100)&&(ch>=0&&ch<=100)&&(hi>=0&&hi<=100)&&(eg>=0&&eg<=100))
{
   String disSub = "";
   String GraceSub="";
   String failSub = "";
    
    if(mt>=75)
    disSub+="Math , ";
    
    if(ph>=75)
    disSub+="Physics , ";
    
    if(ch>=75)
    disSub+="Chemistry , ";
    
    if(hi>=75)
    disSub+="Hindi , ";
    
    if(eg>=75)
    disSub+="English , ";
    
    
    int count=0;
    if(mt<33)
    {
    count++;
    failSub+="Math , ";
    }
    if(ph<33)
    {
    count++;
    failSub+="Physics , ";
    }
    if(ch<33)
    {
    count++;
    failSub+="Chemistry , ";
    }
    if(hi<33)
    {
    count++;
    failSub+="Hindi , ";
    }
    if(eg<33)
    {
    count++;
    failSub+="English , ";
    }
    
    //check count of fail subjects
    if(count==2)
    {
       System.out.println();
       System.out.println("FAIL");
       System.out.println("Failed in = "+failSub);
    }
    else if(count==1 || count==0)
    {
       int grace;
       
       if(count==1)
       { 
           if(mt>=28 && mt<33)
           {
             grace = 33-mt;
             mt = mt+grace;
             GraceSub = "Pass with Grace(Math)";
           }
           else if(ph>=28 && ph<33)
           {
             grace = 33-ph;
             ph = ph+grace;
             GraceSub = "Pass with Grace(Physics)";
           }
           else if(ch>=28 && ch<33)
           {
             grace = 33-ch;
             ch = ch+grace;
             GraceSub = "Pass with Grace(Chemistry)";
           }
           else if(hi>=28 && hi<33)
           {
             grace = 33-hi;
             hi = hi+grace;
             GraceSub = "Pass with Grace(Hindi)";
           }
           else if(eg>=28 && eg<33)
           {
             grace = 33-eg;
             eg = eg+grace;
             GraceSub = "Pass with Grace(English)";
           }
           else
           {
              if(mt<28)
              {
                 GraceSub = "Suplyment in Math";
              }
              else if(ph<28)
              {
                 GraceSub = "Suplyment in Physics";
              }
              else if(ch<28)
              {
                 GraceSub = "Suplyment in Chemistry";
              }
              else if(hi<28)
              {
                 GraceSub = "Suplyment in Hindi";
              }
              else if(eg<28)
              {
                 GraceSub = "Suplyment in English";
              }
              
           }
    
        }//"if(count==1)" end.
        else
        {
          float per = (mt+ph+ch+hi+eg)/5;
          if(per>33 && per<45)
          {  System.out.println();
             System.out.print("Pass with Third Division.");
          }
          else if(per>=45 && per<=59)
          {  System.out.println();
             System.out.print("Pass with Second Division.");
          }
          else 
          {  System.out.println();
             System.out.print("Pass with First Division.");
          }

        } 
    
       System.out.println();
       System.out.println(GraceSub);
       System.out.println("Distint in = "+disSub);
    }
       
}
else
{
System.out.println();
System.out.print("Enter Marks Between 0-100");
}

}
}

