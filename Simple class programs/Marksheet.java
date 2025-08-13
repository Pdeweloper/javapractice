class Marksheet
{
	//this varibles taking name of student and marks of subjects.
	private String sname;
	private int mt;
	private int ph;
	private int ch;
	private int hi;
	private int eg;
	
	//this varibles taking distint subjects,Grace Subjects,Failed subjects and division.
	private String disSub;
	private String GraceSub;
	private String failSub;
	private String Division;
	private int count=0;
	
	//this methode is taking inpute from object in main class. 
	void takeinput(String sname,int mt,int ph,int ch,int hi,int eg)
	{
		this.sname=sname;
		this.mt=mt;
		this.ph=ph;
		this.ch=ch;
		this.hi=hi;
		this.eg=eg;
	}
	
    //this methode is calculating result.
	void createMarksheet()
	{
		if((mt>=0&&mt<=100)&&(ph>=0&&ph<=100)&&(ch>=0&&ch<=100)&&(hi>=0&&hi<=100)&&(eg>=0&&eg<=100))
      {
         disSub = "";
         GraceSub="";
         failSub = "";
    
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
         
         
         count=0;
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
         if(count==1 || count==0)
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
               float per = (mt+ph+ch+hi+eg)/5.0f;
               if(per>33 && per<45)
               {  
                  Division="Pass with Third Division.";
               }
               else if(per>=45 && per<=59)
               { 
                  Division="Pass with Second Division.";
               }
               else 
               {
                  Division="Pass with First Division.";
               }
     
             } 
         }
       
      }
	}
	
	//this method printing result of student.
	void display()
	{
		
		Object arr[] = new Object[8];
	
		arr[0]=sname;
		arr[1] = mt;
		arr[2] = ph;
		arr[3] = ch;
		arr[4] = hi;
		arr[5] = eg;
		
		if(count==2)
		{
			arr[6]="Fail , Fail in "+failSub;
		}
		else if(count==1)
		{
			arr[6] = GraceSub;
			arr[7] = "Distint in = "+disSub;
		}
		else
		{
			arr[6] = Division;
			arr[7] = "Distint in = "+disSub;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
			 
		/*
		System.out.println();
		System.out.println("Student name : "+sname);
	
		System.out.println("Math : "+mt);
		System.out.println("Physics : "+ph);
		System.out.println("Chemistry : "+ch);
		System.out.println("Hindi : "+hi);
		System.out.println("English : "+eg);
		
		 if(count==2)
         {
            System.out.println();
            System.out.println("FAIL");
            System.out.println("Failed in = "+failSub);
         }
		 else if(count==1)
		 {
			 System.out.println();
			 System.out.println(GraceSub);
			 System.out.println("Distint in = "+disSub);
		 }
		 else
		 {
			 System.out.println();
			 System.out.println(Division);
			 System.out.println("Distint in = "+disSub);
		 }
		 */
	}
}
		
		