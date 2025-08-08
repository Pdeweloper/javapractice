import java.util.Scanner;

class MaxElementOfRow
{
public static void main(String...x)
{
   int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
   
   //here we are Printing our Matrix 
   System.out.println("Your Matrix is : ");
    for(int i=0;i<3;i++)
   {
      for(int j=0;j<3;j++)
	  {
		System.out.print(matrix[i][j]+" ");
	  }
	  System.out.println();
   }
		  
	System.out.println();
	
	//here we are finding the max element of row and displaying it.
   for(int i=0;i<3;i++)
   {
	   int max=0;
      for(int j=0;j<3;j++)
	  {
         if(max<matrix[i][j])
		 {
			 max=matrix[i][j];
		 }
      } 
     System.out.print("Max of row"+(i+1)+" is "+max);
     System.out.println();	 
   }	   
}
}

//----------------------------------------------------------------------------------

class MaxElementOfRowDynamic
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row size : ");
		int row = sc.nextInt();
		
		System.out.print("Enter column size : ");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		
		System.out.println("Enter Value of Matrix : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Value of m["+i+j+"] : ");
				matrix[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
	//here we are Printing our Matrix 
    System.out.println("Your Matrix is : ");
    for(int i=0;i<row;i++)
   {
      for(int j=0;j<col;j++)
	  {
		System.out.print(matrix[i][j]+" ");
	  }
	  System.out.println();
   }
		  
	System.out.println();
	
	//here we are finding the max element of row and displaying it.
   for(int i=0;i<row;i++)
   {
	   int max=0;
      for(int j=0;j<col;j++)
	  {
         if(max<matrix[i][j])
		 {
			 max=matrix[i][j];
		 }
      } 
     System.out.print("Max of row"+(i+1)+" is "+max);
     System.out.println();	 
   }	
  }
}  