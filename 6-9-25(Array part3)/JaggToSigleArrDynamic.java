package six_8_25;

import java.util.Scanner;

public class JaggToSigleArrDynamic
{
	public static void main(String...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
		int row = sc.nextInt();
		
		int jagarr[][] = new int[row][];
		int sigsize=0;
		
		for(int i=0;i<row;i++)
		{
			System.out.print("Enter colsize for "+i+" row : ");
			int col = sc.nextInt();
			jagarr[i] = new int[col];
			for(int j=0;j<col;j++)
			{
				System.out.print("Value of "+i+j+" : ");
				jagarr[i][j] = sc.nextInt();
				sigsize++;
			}
		}
		
		System.out.println("Jagged Array is : ");
		for(int i=0;i<jagarr.length;i++)
		{
			for(int j=0;j<jagarr[i].length;j++)
			{
				System.out.print(jagarr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sigarr[] = new int[sigsize];
		int index=0;
		for(int i=0;i<jagarr.length;i++)
		{
			for(int j=0;j<jagarr[i].length;j++)
			{
				sigarr[index++] = jagarr[i][j];
			}
		}
		
		System.out.print("Single array is : ");
		for(int val:sigarr)
		{
			System.out.print(val+" ");
		}
	}
}

