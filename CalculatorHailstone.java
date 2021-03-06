/*
 * Program: CalculatorHailstone.java
 * Author: Kenny Chyzewski
 * Description: This program breaks down a number into its hailstone.
 */

import java.io.*;//This is required for command line input
public class Calc5
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the hailstone of the inputted number.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    int number = 0; // This variable holds the number the user inputs
    int counter = 0; // This variable holds the counter number for counting the number of steps it takes
    boolean flag = true; //This variable holds the loop as true or flase (repeat or end)
    
    do
    {
      try
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement
        {
          System.out.println("With the two entered digits, this program creates a necklace that ends with the two numbers your started with.");
        }
        
        System.out.println("Enter a whole number."); //The math begins with asking for the user's input
        s = br.readLine(); //Reads the users input and s is now declared as that input
        number = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
      }
      //This will support the program if try fails
      catch (IOException ex)
      {
        ex.printStackTrace();
      } 
      
      if(number % 2 == 0) //If the number inputed by user is an even number, it goes
      {
        number = number / 2; // Number is divided by 2
        System.out.print(number + ",");
        counter++; //Adds to the number of steps
      }
      else if (number % 2 == 1) //If the number is inputed by user is an odd number, it goes through the following math
      {
        number = number * 3 + 1; //The number is multiplied by 3, plus 1
        System.out.print(number+ ",");
        counter++; //Adds to the number of steps
      }
      if(number == 1) //Once the number reaches 1, the loops ends because it will just keep repeating 
      {
        flag = false; 
      }
      System.out.println(" "); //Used to space out the next line, otherwise the next print statement would appear on the same line and the previous print statement
      System.out.println("Total steps it took to reach the end: " + counter); // Steps take during hailstone is given as output      
      System.out.println("Would you like to continue?"); //Asks the user if they would like to use the program again from the start
      System.out.println("Please select 'yes' or 'no'"); //The users input will now enter the if statement
      
      try
      { 
        s = br.readLine(); //Reads the users input and s is now declared as that input
      }
      catch(IOException ex)
      {
        ex.printStackTrace(); 
      }
      if (s.equals ("no")) //This turns the flag variable to false and stops the loop
      {
        flag = false;
      }
      else if (s.equals ("yes")) //This keeps the flag variable true and repeats the loop from the beginning
      {
        flag = true; //Makes sure all the variables reset for the next use
        number = 0;
        counter = 0;
      }
      else //User did not input a proper answer and the program ends 
      {
        System.out.println("The character you typed is invalid");
        flag = false;
      }        
    } while (flag);
  }
}
