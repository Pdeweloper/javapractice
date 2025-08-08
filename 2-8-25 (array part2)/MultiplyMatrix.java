import java.util.Scanner;

class MultiplyMatrix
{
public static void main(String...x)
{

int m1[][] = {{1,2},{3,4}};
int m2[][] = {{4,3},{2,1}};

int mul[][] = new int[2][2];

for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
   {
       mul[i][j]=0;
      for(int k=0;k<2;k++)
      {
         mul[i][j]+=m1[i][k]*m2[k][j];
      }
   }
}

for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
   {
        System.out.print(mul[i][j]+" ");
   }
  System.out.println();
}

}
}

//-----------------------------------------------------------------------------------------

class MultiplyMatrixDynamic
{
public static void main(String...x)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number for Square sized Matrix : ");
int num = sc.nextInt();

//taking input value for Matrix-1
System.out.println("Enter values of Matrix1 : ");
int m1[][] = new int[num][num];
for(int i=0;i<num;i++)
{
   for(int j=0;j<num;j++)
   {
       System.out.print("Value of mat1["+i+j+"] : ");
       m1[i][j] = sc.nextInt();
   }
}

//taking input value for Matrix-2 
System.out.println("Enter values of Matrix2 : ");
int m2[][] = new int[num][num];
for(int i=0;i<num;i++)
{
   for(int j=0;j<num;j++)
   {
       System.out.print("Value of mat2["+i+j+"] : ");
       m2[i][j] = sc.nextInt();
   }
}

//calculating multiply and storing in "mul[][]" matrix.
int mul[][] = new int[num][num];
for(int i=0;i<num;i++)
{
   for(int j=0;j<num;j++)
   {
       mul[i][j]=0;
      for(int k=0;k<num;k++)
      {
         mul[i][j]+=m1[i][k]*m2[k][j];
      }
   }
}

//Displaying final Multiplied Array Matrix.
System.out.println();
System.out.println("Multiplication is : ");
for(int i=0;i<2;i++)
{
   for(int j=0;j<2;j++)
   {
        System.out.print(mul[i][j]+" ");
   }
  System.out.println();
}


}
}
