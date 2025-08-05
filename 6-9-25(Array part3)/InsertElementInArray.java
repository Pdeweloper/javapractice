import java.util.Scanner;

class InsertElementInArray
{
public static void main(String...x)
{
Scanner sc = new Scanner(System.in);

int arr[] = new int[10];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
arr[3] = 4;

int size = 4; //taking size of already placed arr 
int newel;
int op=0;

while(op!=5)
{
   System.out.print("Choose Option : \n1.Insert form begining\n2.Insert from specific position\n3.Insert from last\n4.Display Array\n5.Exit\n");
   System.out.print("Enter Option : ");
   op=sc.nextInt(); //taking option.

   switch(op)
   {
      case 1:
      System.out.print("Enter element : ");
      newel = sc.nextInt();
            
      for(int i=size;i>=1;i--)
      {
          arr[i] = arr[i-1];
      }
      arr[0] = newel;
      size++;
       System.out.println();
       System.out.println();
      break;

      case 2:
      System.out.print("Enter element : ");
      newel = sc.nextInt();

      System.out.print("Enter index on which you want to insert : ");
      int pos = sc.nextInt();

      for(int i=size;i>=pos;i--)
      {
         arr[i]=arr[i-1];
      }
      arr[pos] = newel;
      size++;
       System.out.println();
       System.out.println();
      break;

      case 3:
      System.out.print("Enter element : ");
      newel = sc.nextInt();
 
      arr[size]=newel;
      size++;
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
 first we take new element.
 we shift the arr elements with +1 index.

case 2 :-
 taking new ele and index at which we insert
 firt we shift element form pos to size.
 then we insert new element at pos(user given) index.
 
case 3 :-
 taking new ele.
 Simply we insert new ele at last index.

case 4:-
 Displaying arr from 0-to-size.

case 5 :-
 when op==5 while condition false and loop(program) end.
*/