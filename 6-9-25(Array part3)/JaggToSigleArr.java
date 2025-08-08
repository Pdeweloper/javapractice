package six_8_25;

public class JaggToSigleArr {

	public static void main(String[] args) {
		int jagarr[][]=new int[5][];
		int element = 1;
		
		System.out.println("Jagged Array is : ");
		for(int i=0;i<5;i++)
		{
			int col = 5-i;
			jagarr[i] = new int[col];
			
			for(int j=0;j<col;j++)
			{
				jagarr[i][j]=element;
				element++;
				System.out.print(jagarr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sigarr[] = new int[element-1];
		int index=0;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				sigarr[index++] = jagarr[i][j];
			}
		}
		
		System.out.println("Single Dimention Array is : ");
		for(int x:sigarr)
		{
			System.out.print(x+" ");
		}

	}

}


