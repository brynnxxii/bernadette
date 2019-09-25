import java.util.Scanner;
   public class Ayuban_labact3 
{
     public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in); 
      //declare variables
      long tsec, hrs, min=60, sec=60, time;
      
      //input
       System.out.println("Enter time in seconds: ");
       tsec = in.nextLong();
      
      //compute
       hrs = tsec / 3600;
       min = tsec % 3600/60;
       sec = tsec % 60;
       
      
      //display
       System.out.println("Time is" + hrs + "hour" + min + "minutes" + sec + "seconds\n\n");
       
       
       
       //declare variables
       double cost;
       
       //input
       System.out.print("Enter the driving distance: ");
       double d_dist = in.nextDouble();
       System.out.print("Enter miles per galon: ");
       double mi_gal = in.nextDouble();
       System.out.print("Enter price per galon: ");
       double p_gal = in.nextDouble();
       
       //compute
       cost = (d_dist / mi_gal) * p_gal;
       
       //display
       System.out.printf("The cost of driving is $%.2f",cost);
    }
    
}
