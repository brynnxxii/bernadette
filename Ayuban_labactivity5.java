import java.util.Scanner;
  public class Ayuban_labactivity5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
      //declare variables
        int sum;
        String diagnosis="";
      //input
        System.out.println("Answer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS");
        System.out.print("1. I am competitive: ");
        int n1 = in.nextInt();
        System.out.print("2. I am annoyed by people who are late for appointments: ");
        int n2 = in.nextInt();
        System.out.print("3. I perform several tasks simultaneously: ");
        int n3 = in.nextInt();
        System.out.print("4. I am ambitious: ");
        int n4 = in.nextInt();
        System.out.print("5. I rush to get task completed: ");
        int n5 = in.nextInt();
        System.out.print("6. I wory about the future: ");
        int n6 = in.nextInt();
        System.out.print("7. I am in a race with time: ");
        int n7 = in.nextInt();
        System.out.print("8. I speak very rapidly: ");
        int n8 = in.nextInt();
        
        sum = n1+n2+n3+n4+n5+n6+n7+n8;
        if (sum >= 35 && sum <=40) 
        {
            diagnosis = "Type A";
        }
        else if (sum >= 21 && sum <=34) 
        {    
            diagnosis = "Between A and B, tending towards A";
        }
        else if (sum >= 12 && sum <=20) 
        {
            diagnosis = "Between A and B, tending towards B";
        }
        else if (sum >= 8 && sum <=11) 
        {
            diagnosis = "Type B";
        }
        System.out.printf("Score: %d. You are %s\n\n", sum,diagnosis);
    
        
        //Problem no. 2
        
        //input
        System.out.println("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        if (num1 > num2 && num1 > num3)
        {    
            System.out.println("The Largest is " + num1);
        }
        else if (num2 > num1 && num2 > num3)
        {    
            System.out.println("The Largest is " + num2);
        }  
        else if (num3 > num1 && num3 > num2)
        {    
            System.out.println("The Largest is " + num3);
        }
        
                
    
    }
   
}
