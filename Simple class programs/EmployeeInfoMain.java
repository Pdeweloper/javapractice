import java.util.Scanner;

class EmployeeInfoMain
{
	public static void main(String...x)
	{
		Scanner sc=new Scanner(System.in);
		
		//here taking number of employee.
		System.out.print("Enter number of Employees : ");
		int size = sc.nextInt();
		
		EmployeeInfo objarr[] = new EmployeeInfo[size];//array to store obj of Class
		
		for(int i=0;i<objarr.length;i++)
		{
			objarr[i] = new EmployeeInfo();//creating object for every Employee. 
			
			objarr[i].accept();
		}
		System.out.println();
		System.out.println("Employees Information : \n");
		
		//here we printing all data of Employees.
		for(int i=0;i<objarr.length;i++)
		{
			objarr[i].display();
			System.out.println();
			System.out.println();
		}
	}
}