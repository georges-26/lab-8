package lab7;

import java.io.FileWriter;  
import java.io.IOException;  
import java.util.Scanner;


public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
    
    Scanner sc = new Scanner(System.in);

      String name;
      String purchase;
      double cost;
     String decision = "";

  do{
    System.out.print("Enter your name: ");
      name = sc.next();
    System.out.print("What did you purchase? ");
      purchase = sc.next();
    System.out.print("How much did you pay? ");
      cost = sc.nextDouble();
      FileWriter writer = new FileWriter("expenses.txt");
 
      writer.write( name + " purchased " + purchase + " for " + cost + " US Dollars.");
      
    System.out.println(name+ " purchased "+purchase+ " for "+ cost + " US Dollars.");
      System.out.println("Would you like to log another purchase? (y/n)");
      decision = sc.next();
  }while(decision.equals("y"));

    System.out.println("Would you like to read a summary of your purchases?");
    String bonusdecision = sc.next();

    if(bonusdecision.equals("n")){
      System.out.print("Get off of ZoodMall!");
     }
    if (bonusdecision.equals("y")){
         FileWriter writer = new FileWriter("expenses.txt");
         writer.write( name + " purchased " + purchase + " for " + cost + " US Dollars.");
        
    }
       FileWriter writer = new FileWriter("expenses.txt");
writer.close();

      
    
      
      sc.close();
    
  }

}
