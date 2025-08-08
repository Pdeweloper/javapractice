package six_8_25;

import java.util.Scanner;

public class SortJagArrRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
		int row = sc.nextInt();
		
		char jagarr[][] = new char[row][];
		
		
		//here we are taking values for jagged array
		for(int i=0;i<row;i++)
		{
			System.out.print("Enter colsize for "+i+" row : ");
			int col = sc.nextInt();
			jagarr[i] = new char[col];
			for(int j=0;j<col;j++)
			{
				System.out.print("Value of "+i+j+" : ");
				jagarr[i][j] = sc.next().charAt(0);
			}
		}
		
		//here we sorting array by bubble short
		for(int i=0;i<jagarr.length;i++)
		{
			for(int j=0;j<jagarr[i].length-1;j++)
			{
				for(int k=0;k<jagarr[i].length-j-1;k++)  //here we are using bubble short
				{
					if(jagarr[i][k]>jagarr[i][k+1])
						
					{
						char temp = jagarr[i][k];
						jagarr[i][k] = jagarr[i][k+1];
						jagarr[i][k+1] = temp;
					}
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.print("Sorted Jagged Array is : ");
		for(int i=0;i<jagarr.length;i++)
		{
			for(int j=0;j<jagarr[i].length;j++)
			{
				System.out.print(jagarr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
