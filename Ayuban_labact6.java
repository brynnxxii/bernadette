import java.util.Random;
 import java.util.Scanner;

  public class Ayuban_labact6 
{
   public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       //declare variables
       long phone_num, remainder;
       long f_part,s_part,t_part;
       
      //input
       System.out.print("Enter a 10-digit number:");
       phone_num = in.nextLong();
       f_part = phone_num/10000000;
       remainder = phone_num%10000000;
       s_part = remainder/10000;
       t_part = remainder%10000;
       if (f_part == 800 || f_part == 888 || f_part == 877 || f_part == 866)
       System.out.println(f_part+ "-" + s_part + "-" + t_part + "is a toll-fee number." );
       else 
       System.out.println(f_part+ "-" + s_part + "-" + t_part + "is not a toll-fee number.\n" );
    
       
       
       //number2
       Random rand = new Random();
       
       //declare
       int comp;
       
       
       System.out.println("Rock:0; Scissors:1; Paper:2 --");   
       System.out.println("Choose: ");
       int player = in.nextInt();
       comp = rand.nextInt(3);
       
       System.out.println("The computer chooses" + comp);
       
       if (player == comp) System.out.println("Draw");
       else if ((player == 0) && (comp == 1))
       {
           System.out.println("Player: Rock \ncomp: Scissors");
           System.out.println("Player win");
       }
       else if ((player == 0) && (comp == 2))
       {
           System.out.println("Player: Rock \ncomp: Paper");
           System.out.println("Player lose");
       }
       else if ((player == 1) && (comp == 0))
       {
           System.out.println("Player: Scissors  \ncomp: Rock");
           System.out.println("Player lose");
       }
       else if ((player == 1) && (comp == 2))
       {
           System.out.println("Player: Scissors \ncomp: Paper");
           System.out.println("Player win");
       }
       else if ((player == 2) && (comp == 0))
       {
           System.out.println("Player: Paper \ncomp: Rock");
           System.out.println("Player win");
       }
       else if ((player == 2) && (comp == 1))
       {
           System.out.println("Player: Paper \ncomp: Scissors");
           System.out.println("Player lose");
       }
       else System.out.println("Error");
    }
    
}
