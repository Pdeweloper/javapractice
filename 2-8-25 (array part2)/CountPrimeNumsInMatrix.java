import java.util.Scanner;

class CountPrimeNumsInMatrix
{
public static void main(String...x)
{
int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};

System.out.print("Prime Numbers are : ");
for(int i=0;i<3;i++)
{
   for(int j=0;j<3;j++)
   {
       int num = mat[i][j];

       if(num<2)
       continue;

       Boolean prime = true;

       for(int k=2;k<num;k++)
       {
          if(num%k==0)
          {
             prime=false;
             break;
          }
       }

      if(prime)
      System.out.print(mat[i][j]+" ");
   }
}

}
}

//-------------------------------------------------------------------------------------------

class CountPrimeNumsInMatrixDynamic
{
public static void main(String...x)
{

Scanner sc = new Scanner(System.in);

System.out.print("Enter row size : ");
int row = sc.nextInt();

System.out.print("Enter column size : ");
int col = sc.nextInt();

int matrix[][] = new int[row][col];


//taking input value for Matrix.
System.out.println("Enter Matrix Values : ");
for(int i=0;i<row;i++)
{
   for(int j=0;j<col;j++)
   {
       System.out.print("Value of arr["+i+j+"] : ");
       matrix[i][j] = sc.nextInt();
   }
}

//Printing Matrix using following loops
System.out.println();
System.out.println("Your Matrix is : ");
for(int i=0;i<row;i++)
{
   for(int j=0;j<col;j++)
   {
      System.out.print(matrix[i][j]+" ");
   }
  System.out.println();
}

//checking prime number and diplaying it.
System.out.println();
System.out.print("Prime Numbers are : ");
for(int i=0;i<row;i++)
{
   for(int j=0;j<col;j++)
   {
       int num = matrix[i][j];

       if(num<2) //skiping 1 to process.
       continue;

       Boolean prime = true; //checking prime number
       for(int k=2;k<num;k++)
       {
          if(num%k==0)
          {
             prime=false;
             break;
          }
       }

      //diplay if it is prime=true.
      if(prime)
      System.out.print(matrix[i][j]+" ");
   }
}

}
}
