/*
 * Program: ChangeCalculator.java
 * Author: Kenny Chyzewski
 * Language: Java
 * Description: A calculator the quantity of coins required to make change.
 */
import java.io.*; //Required for command line input
public class ChangeChange
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the quantity of coins required to make change.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int penny = 0;
    int nickel = 0;
    int dime = 0;
    int quarter = 0;
    int change = 0;
    int remainder = 0;  
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      
      System.out.println("Total change amount.");
      
      s = br.readLine();
      change = Integer.parseInt(s);
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    
    quarter = change / 25;   //Over the next few lines, the math is being solved by taking the current change, dividing by the selected coin, then proceeding with the remainder.
    remainder = change % 25;      
    dime = remainder /10;
    remainder = change % 10;
    nickel = remainder /5;
    remainder = change % 5;
    penny = remainder /1;
    remainder = change % 1;
    
    System.out.println("The total change is " + quarter + " quaters, " + dime + " dimes, " + nickel + 
                       " nickels, and " + penny + " pennies.");
  }
}
