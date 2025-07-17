import java.util.Scanner;

class SocialMedia
{
public static void main(String...agr)
{
Scanner s = new Scanner(System.in);
System.out.print("I-Instagram\nX-twiter\nY-YouTube\nW-WhatsApp\n");
System.out.print("Enter your Option : ");
char ch = s.next().charAt(0);

switch(ch)
{  
    case 'i':
    case 'I':
      System.out.print("You choosed Instagram...");
      break;
    case 'x':
    case 'X':
      System.out.print("You choosed Twitter...");
      break;
    case 'y':
    case 'Y':
      System.out.print("You choosed YouTube...");
      break;
    case 'w':
    case 'W':
      System.out.print("You choosed WhatsApp...");
      break;
    default:
      System.out.print("\nIncorrect Choice , Choose Correct Option");
      break;
}

}
}