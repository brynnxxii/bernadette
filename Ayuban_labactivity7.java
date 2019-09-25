import java.util.Scanner;
  public class Ayuban_labactivity7 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in); 
      int fir, num, last; 
      // innput
      System.out.print("Enter a three-digit integer: ");
      num = in.nextInt();
      fir = num/100;
      last = num % 10;
      
      if(last == fir)
          System.out.println(num + " is a palindrome");
      else 
          System.out.println(num + " is not a palindrome\n");
          
          
      //number2
      //declare
      String today, futureday;
      System.out.print("Enter today's day: ");
      int day = in.nextInt();
      System.out.print("Enter the number of days elapsed since today: ");
      int numDays = in.nextInt();
         
        switch (day) {
            case 0:
                today = "Sunday";
                break;
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "Tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "Thursday";
                break;
            case 5:
                today = "Friday";
                break;
            default:
                today = "Saturday";
                break;
        }
        
        int calcFutureday = (day + numDays) % 7;
         
        switch (calcFutureday) {
            case 0:
                futureday = "Sunday";
                break;
            case 1:
                futureday = "Monday";
                break;
            case 2:
                futureday = "Tuesday";
                break;
            case 3:
                futureday = "Wednesday";
                break;
            case 4:
                futureday = "Thursday";
                break;
            case 5:
                futureday = "Friday";
                break;
            default:
                futureday = "Saturday";
                break;
        }
         
        System.out.println("Today is " + today + " and the future day is " + 
                futureday);
     
    }
    
}
