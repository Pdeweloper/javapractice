
//MARKSHEET PROGRAM USING FIVE DIFFERENT STUDENTS AND FIND MAX OBTAINED MARKS,  Aggregate marks.

//in this we are taking array as parameter.

class StudentMarks
{
	private String sname;
	private int marks[];
	private String sub[];
	
	public float per=0.0f;
	private int total=0,max=0;
	
	//sub arr and marks arr are taking as parameter.
	void accept(String sname,String sub[],int marks[])
	{
		this.sname=sname;
		this.marks=marks;
		this.sub=sub;
	}
	
	void calMaxMark()
	{
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max = marks[i];
			}
		}
	}
	
	void calPersent()
	{
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		
		per = total/marks.length;
	}
	
	void display()
	{
		System.out.println("Report of "+sname);
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(String.format("%s = %d",sub[i],marks[i])+"   ");
		}
		
		System.out.print("Maximum Mark is "+max);
	}
}