/*
 * Program: FactorialCalculator.java
 * Author: Kenny Chyzewski
 * Description: This program breaks a whole number into its factorial.
 */

import java.io.*; //This is required for command line input
public class Calc4
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the factorial of the number that is inputted.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    int number1 = 0; //This variable holds the number the user inputs
    int total = 1;  //This variable holds the total after the calculation
    boolean flag = true; //This variable holds the loop as true or flase (repeat or end)
    
    do
    {
      try 
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement 
        {
          System.out.println("With the entered digit, this program creates the factorial of the given number.");
        } 
        System.out.println("Enter a whole number."); //The math begins with asking for the user's input
        s = br.readLine(); //Reads the users input and s is now declared as that input
        number1 = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
      }
      //This will support the program if try fails
      catch(IOException ex) 
      {
        ex.printStackTrace();
      }
      
      if (number1 == 1) //If the number the user input is one it will print one and avoid the math
      { 
        System.out.println(number1 + "! is 1"); 
      }
      else //If the number the user inputted is > 1 the factorial begins
      {
        System.out.print(number1 + "! is ");
        while (number1 > 0)  
        {                   
          total = total * number1; //Multiplys the users inputted number by the same number minus 1, and repeats until that number is subtracted to zero 
          System.out.print(number1); //Prints the numbers to show the steps
          System.out.print(" * "); //Used to show what is multplied and s being done throughout the math
          number1--; //Keeps subtracting 1 from what the user inputted to show the steps involved
        }
        System.out.print("= " + total); //This prints the total of the factorial of the user inputted number
      }
      System.out.println(" "); //Used to space out the next line, otherwise the next print statement would appear on the same line and the previous print statement
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
        total = 1; //Makes sure all the variables reset for the next use
        flag = true;
      }
      else //User did not input a proper answer and the program ends
      {
        System.out.println("The character you typed is invalid");
        flag = false;
      }   
    } while (flag);
  }
}
