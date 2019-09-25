import java.util.Scanner;
  public class Ayuban_labact4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
         //declare
           double f_cost, tax, result;
           double ship = 5;
         //input
           System.out.println("Enter the item price: $");
           double item_price = in.nextDouble();
         //compute
               
           tax = item_price * 0.08;
           f_cost = item_price + tax;
           result = item_price + tax + ship;
           
          //display
           System.out.println("Tax $" + tax);
           System.out.println("Shipping is $" + ship);
           System.out.println("Final cost $" + result);
        
        
    }
    
}
