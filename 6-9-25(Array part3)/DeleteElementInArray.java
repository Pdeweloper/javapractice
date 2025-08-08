import java.util.Scanner;

class DeleteElementInArray
{
public static void main(String...x)
{
Scanner sc = new Scanner(System.in);

int arr[] = new int[10];

arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;

int size = 4;
int op=0;


while(op!=5)
{
   System.out.print("Choose Option : \n1.Delete first number\n2.Delete from specific position\n3.Delete last number\n4.Display Array\n5.Exit\n");
   System.out.print("Enter Option : ");
   op=sc.nextInt(); //taking option.

   switch(op)
   {
      case 1:            
      for(int i=0;i<size;i++)
      {
          arr[i] = arr[i+1];
      }
      size--;
      System.out.print("Deleted Successfully..");
       System.out.println();
       System.out.println();
      break;

      case 2:
      System.out.print("Enter index on which you want to delete : ");
      int pos = sc.nextInt();

      for(int i=pos;i<size;i++)
      {
         arr[i]=arr[i+1];
      }
      size--;
      System.out.print("Deleted Successfully..");
       System.out.println();
       System.out.println();
      break;

      case 3: 
      arr[size]=0;
      size--;
      System.out.print("Deleted Successfully..");
       System.out.println();
       System.out.println();
      break;

      case 4:
      for(int i=0;i<size;i++)
      {
         System.out.print(arr[i]+" ");
      }
       System.out.println();
       System.out.println();
      break;

      case 5:
      System.out.print("Thank you...");
       System.out.println();
      break;

     default:
     System.out.print("Invalid Option , Choose Correct option");
       System.out.println();
       System.out.println();
     break;

   } //switch end.

} //while end.

}
}

/*
case 1 :- 
 we shift the arr elements with -1 index.
 arr[0]=arr[0+1] , arr[1]=arr[1+1] etc...

case 2 :-
 taking index at which we want to delete.
 form this index, we shift element 
 arr[pos] = pos+1 , etc...
 
case 3 :-
 Simply delete element from last index.
 arr[size] = 0;

case 4:-
 Displaying arr from 0-to-size.

case 5 :-
 when op==5 while condition false and loop(program) end.
*/