import java.util.Scanner;

class MarksheetMain
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Student : ");
		int size = sc.nextInt();
		
		int mt=0,ph=0,ch=0,hi=0,eg=0;
		
		Marksheet obj[] = new Marksheet[size]; //array to store obj of Class 
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = new Marksheet(); //creating object for every Student. 
			
			//taking name of every student. 
			System.out.print("Enter Student name : ");
			String sname = sc.next();
			
			System.out.println("Enter Marks : \n");
			
			//taking marks of every subject.
			System.out.print("Maths : ");
			mt = sc.nextInt();
			System.out.print("Physics : ");
			ph = sc.nextInt();
			System.out.print("Chemistry : ");
			ch = sc.nextInt();
			System.out.print("Hindi : ");
			hi = sc.nextInt();
			System.out.print("English : ");
			eg = sc.nextInt();
			
			//if input marks is valid , then move, otherwise end program.
			if((mt>=0&&mt<=100)&&(ph>=0&&ph<=100)&&(ch>=0&&ch<=100)&&(hi>=0&&hi<=100)&&(eg>=0&&eg<=100))
			{
			obj[i].takeinput(sname,mt,ph,ch,hi,eg);
			obj[i].createMarksheet();
			}
			else
			{
				System.out.println();
                System.out.print("Enter Marks Between 0-100");
				break;
			}
			
		}
		
		String subname[] = {"Sname","Math:","Physics:","Chemistry:","Hindi:","English:","Result","DistSub:"};
		System.out.println("Result is Giving according to this formate : ");
		
		//here we printing formate of result.
		for(int i=0;i>subname.length;i++)
		{
			System.out.print(subname[i]+"  ");
		}
		System.out.println();
		
		//here we printing all data of student.
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
			System.out.println();
			System.out.println();
		}
	}
}
			