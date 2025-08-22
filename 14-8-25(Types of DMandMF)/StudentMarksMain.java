import java.util.Scanner;

class StudentMarksMain
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		
		//here we taking number of subject
		System.out.print("Enter number of subjects : ");
		int subsize = sc.nextInt();
		String sub[] = new String[subsize]; //String array of size(no. of subject).
		
        //here we taking subject names and storing it in sub array.		
		System.out.println("Enter subjects names : ");
		for(int i=0;i<sub.length;i++)
		{
			System.out.print("Subject "+(i+1)+" : ");
			sub[i] = sc.next();
		}
		System.out.println();
		
		//here taking number of student.
		System.out.print("Enter number of Student : ");
		int ssize = sc.nextInt();
		
		
		//here we creating array to store obj of all student.
		StudentMarks obj[] = new StudentMarks[ssize];
		
		double agre = 0; // this will store per of all student.
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new StudentMarks(); 
			
			System.out.println();
			System.out.print("Enter Student name : ");
			String sname = sc.next();
			
			//this is array to store marks.
		    int marks[] = new int[subsize];
			
			//taking marks of subjects in a array.
			System.out.println("Enter Marks of "+sname);
			for(int j=0;j<sub.length;j++)
			{
				System.out.print(sub[j]+" : ");
				marks[j] = sc.nextInt();
			}
			
			//calling methodes of Class using perticular obj.
			obj[i].accept(sname,sub,marks); //passing marks arr and subject arr in method
			obj[i].calMaxMark();
			obj[i].calPersent();
			
			agre+=obj[i].per;
		}
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println();
			obj[i].display();
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Agreegate pecentage is " + (agre/obj.length));
		System.out.println();
	}
}
			
				