import java.util.Scanner;

class QueuebyArray
{
public static void main(String...x)
{
Scanner sc = new Scanner(System.in);
int arr[] = new int[10];  //queue size fixed
int op=0,tolnum=0; //taking op-option , tolnum-to count total inserted number;

while(op!=4)
{
System.out.print("Choose Option : \n1.Enqueue\n2.Dequeue\n3.Display Elements\n4.Exit\n");
System.out.print("Enter Option : ");
op=sc.nextInt(); //taking option.

switch(op)
{
    case 1:
    System.out.print("Enter Number of element you want to insert : ");
    int num = sc.nextInt();
    tolnum +=num; //it is counting total inserted element.

    if(tolnum>10)
    {
       System.out.print("Queue Overflow Error.."); 
       System.out.println();
       continue;
    }
    for(int i=0;i<num;i++)
    {
        System.out.print("Value of "+i+" : "); 
        arr[i] = sc.nextInt();        
    }
    System.out.println();
    System.out.println();
    break;

    case 2:
    System.out.print("Enter position : ");
    int pos = sc.nextInt();
    arr[pos] = 0;
    System.out.print("Deleted Successfully...");
    System.out.println();
    System.out.println();
    break;

    case 3:
    for(int j=0;j<tolnum;j++)
    {
        if(arr[j]==0)
       continue;
   
        System.out.print(arr[j]+" "); 
    }
    System.out.println();
    System.out.println();
    break;

    case 4:
    System.out.print("Thank you...");
    System.out.println();
    break;

    default :
    System.out.print("Invalid Option , Choose Correct option");
    System.out.println();
    System.out.println();
    break;

} //switch end here.  

} //while end here.

}
}


/*
case 1 :- 
 taking nums of elements to insert. 
 counting total inserted element.
 if(tolcount>10) queue overflow and continue. 

case 2 :-
 taking position(index) to delete element.
 replacing given index value with 0.

case 3 :-
 displaying 0 to tolnum index array elemnt.
 print element in order because Queue is (first in first out)

case 4 :-
 when op==4 while condition false and loop(program) end.
*/