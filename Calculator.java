/*
 * Program: Calculator.java
 * Author: Kenny Chyzewski
 * Description: This program is a normal calculator.
 */

import java.io.*;//This is required for command line input
public class Calc1  
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates a problem with two inputted numbers and a selected operator.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    double number1 = 0; //This variable holds the first value the user inputs
    double number2 = 0; //This variable holds the second value the user inputs
    double total = 0; //This variable holds the value of the two numbers followed by an opertor
    boolean flag = true; //This variable holds the loop as true or flase (repeat or end)
    
    
    do
    {
      try
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement
        {
          System.out.println("Once you have any two numbers and operator, this program calculates the total of the equation.");
        }
        
        System.out.println("Enter the first whole number."); //The math begins with asking for the user's input
        s = br.readLine(); //Reads the users input and s is now declared as that input
        number1 = Double.parseDouble(s); //The user input is parsed, and the variable is now assigned a value
        
        System.out.println("What would you like to do with this number.");
        System.out.println("Press '+' to add, '-' to subtract, '*' to multiply, '/' to divide, '^' to the exponent of and '%' for modulus."); //Asks the user for what operator he/she would like to use
        s = br.readLine(); //Reads the users input and s is now declared as that input                   
        
      }
      //This will support the program if try fails
      catch(IOException ex)
      {
        ex.printStackTrace();
      }
      try
      {
        if (s.equals("+")) //If the user types +, the prgram will go through the following math
        { 
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = number1 + number2; //First inputted number is added by the second number
        }
        else if (s.equals("-")) //If the user types -, the prgram will go through the following math
        {
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = number1 - number2; //First inputted number is subtracted by the second number
        }
        else if (s.equals("*")) //If the user types *, the prgram will go through the following math
        {
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = number1 * number2; //First inputted number is multiplied by the second number
        }
        else if (s.equals("/")) //If the user types /, the prgram will go through the following math
        {
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = number1 / number2; //First inputted number is divided by the second number
        }
        else if (s.equals("^")) //If the user types ^, the prgram will go through the following math
        {
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = Math.pow(number1, number2); //Second inputted number is put to the power of the first number
        }
        else if (s.equals("%")) //This input will use the first number and modulue it by the second number
        { 
          System.out.println("Enter the second number");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          number2 = Double.parseDouble(s);
          total = number1 % number2; //First inputted number is modulued by the second number
        }
        else //If the user types a character that has not been listed
        {
          System.out.println("The character you typed is invalid");
        }
      }
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      {
        System.out.println("The total is " + total); //This prints the total of the two calculated numbers
      }
      {
        System.out.println(" "); //Used to space out the next line, otherwise the next print statement would appear on the same line and the previous print statement
        System.out.println("Would you like to continue?"); //Asks the user if they would like to use the program again from the start
        System.out.println("Please select 'yes' or 'no'"); //The users input will now enter the if statement
      }
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
        total = 0; 
      }
      else //User did not input a proper answer and is asked again
      {
        System.out.println("The character you typed is invalid");
        flag = false;
      }         
    } while (flag);    
  }
}
