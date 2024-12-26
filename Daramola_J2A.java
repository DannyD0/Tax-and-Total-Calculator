// Student Info - Java 2A
// Daniel Daramola -F24

import java.util.Scanner ; 
public class Daramola_J2A
{
   public static void main(String [] args)
   {
      int tickPurch ;
      double tickPrice ;
      final double salesTx ;
      double processFee ; 
      double discRate ;
      double basePrice ;
      double discAmount ; 
      double salesTxAmt ;
      double total ;
      double subTotal ;

      
      tickPrice = 109 ;
      salesTx = 0.0825 ;
      processFee = 1.50 ;
      
      
      Scanner keyboard = new Scanner(System.in) ;
      System.out.println("How many tickets do you need? ") ; 
      tickPurch = keyboard.nextInt() ;
      
      if (tickPurch >=5 && tickPurch <=10)
      {
         discRate = 0.05 ;
      }
      else if (tickPurch >=11 && tickPurch <=20)
      {
      discRate = 0.10 ;
      }
      else if (tickPurch >=21 && tickPurch <=40)
      {
         discRate = 0.12 ;
      }
      else if (tickPurch >=40)
      {
      discRate = 0.15 ;
      }
      else
      {
      System.out.print("You do not qualify for a discount.") ;
       discRate = 0 ;
      }
      
            
      basePrice = tickPurch * tickPrice ;
      discAmount = basePrice * discRate ;
      subTotal = basePrice - discAmount ;
      salesTxAmt = subTotal * salesTx ;
      total = subTotal + salesTxAmt + processFee ; 
  
  
      System.out.printf("\nTickets Purchased:      %d\n", tickPurch) ;
      System.out.printf("Base Price:            $%,8.2f\n", basePrice) ; 
      System.out.printf("Discount: (%.0f%%) :      $%.2f\n", discRate*100,discAmount) ;
      System.out.printf("Subtotal:              $%,8.2f\n", subTotal) ;
      System.out.printf("Sales Tax: (8.25%%) :    $%.2f\n", salesTxAmt) ;
      System.out.printf("Total:                 $%,8.2f\n", total) ;



      
      
      
      
      
      
      
      
      
      
   }
}