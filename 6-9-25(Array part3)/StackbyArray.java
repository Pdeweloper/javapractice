import java.util.Scanner;

class StackbyArray
{
public static void main(String...x)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size of stack : ");
int size = sc.nextInt();

int arr[] = new int[size];

System.out.print("Choose Option : \n1.Insert\n2.Delete\n3.Display Elements\n");
System.out.print("Enter Option : ");
int op=sc.nextInt();

switch(op)
{
    case 1:
    for(int i=0;i<size;i++)
    {
        System.out.print("Value of "+i+" : "); 
        arr[i] = sc.nextInt();        
    }
    break;
    case 2:
    System.out.print("Enter position : ");
    int pos = sc.nextInt();
    arr[pos] = 0;
    break;
    case 3:
    for(int j=size;j>=0;j--)
    {
        if(arr[j]==0)
       continue;
   
        System.out.print(arr[j]+" "); 
    }
    break;
    default :
    System.out.print("Invalid Option");
    break;
}

}
}