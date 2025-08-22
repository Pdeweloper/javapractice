//CREATE A CLASS TO MANAGE EMPLOYEE INFORMATION USING EMPID, EMP NAME, JOB, SALARY.

import java.util.Scanner;

class EmployeeInfo
{
	private int eid;
	private String ename;
	private String ejob;
	private int esalary;
	
	private Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.print("Enter Employee ID : ");
		eid = sc.nextInt();
		System.out.print("Enter Employee Name : ");
		ename = sc.next();
		System.out.print("Enter Employee Job Type : ");
		ejob = sc.next();
		System.out.print("Enter Employee Salary : ");
		esalary = sc.nextInt();
		
		System.out.println();
	}
	
	void display()
	{
		Object edata[] = {eid,ename,ejob,esalary};
		
		for(int i=0;i<edata.length;i++)
		{
			System.out.print(edata[i]+"   ");
		}
	}
}
