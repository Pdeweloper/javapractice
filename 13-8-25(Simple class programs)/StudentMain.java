import java.util.Scanner;

class StudentMain
{
	public static void main(String...x)
	{
		/*
		//This is hard code for create objects for multiple student.
		
		Student obj = new Student();  //Student1
		obj.accept(1001,"Aman");
		obj.display();
		
		Student obj1 = new Student();  //Student2
		obj1.accept(1002,"Aryan");
		obj1.display();
		*/
		
		//For dynamic object creation we use array
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Student : ");
		int size = sc.nextInt();
		
		//this is array of objects.
		//here objects are not creating only space is creating to store numbers of object.
		Student obj[] = new Student[size]; 
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new Student(); //here objects are creating to perticular student(Student Class).
			
			System.out.print("Enter Roll No. : ");
			int rno = sc.nextInt();
			System.out.print("Enter Student Name : ");
			String sname = sc.next();
			
			//passing data of perticular student to corrosponding StudentClass.
			obj[i].accept(rno,sname); 
		}
		
		//Display the data of perticular Student Class.
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
		}
	}
}