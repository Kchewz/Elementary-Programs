/*
 * Program: RandomCalculator.java
 * Author: Kenny Chyzewski
 * Date: 10/22/14
 * Description: This program is a normal calculator.
 */

import java.io.*;//This is required for command line input
public class Random2  
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program generates two random numbers and gives you an equation to solve.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    double usernum = 0; //This variable holds the number the user inputs 
    int number1 = 0; //This variable holds the first random number value
    int number2 = 0; //This variable holds the second random number value
    double total = 0; //This variable holds the value of the two numbers followed by an opertor
    int guess = 0; //This variable keeps track of the total incorrect answers 
    int guess2 = 0; //This variable keeps track of the total correct answers 
    boolean flag = true; //This variable holds the loop as true or faase (repeat or end)
    
    
    do
    {
      try
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement
        {
          System.out.println("The program will generate two random numbers from 1 to 100. Once you have any two numbers and operator, you have to solve the equation.");
        }
        
        number1 = (int)(Math.random() * 100) + 1; //This generates the first random number between 1 to 100
        System.out.println("Your first random number is " + number1); //The math begins with asking for the user's input
        
        number2 = (int)(Math.random() * 100) + 1; //This generates the second random number between 1 to 100
        System.out.println("Your second random number is " + number2); //This generates the first random number
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
          
          total = number1 + number2; //First inputted number is added by the second number
          System.out.println("What is the total for the equation: " + number1 + " + " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s);
        }
        else if (s.equals("-")) //If the user types -, the prgram will go through the following math
        {
          total = number1 - number2; //First inputted number is subtracted by the second number
          System.out.println("What is the total for the equation: " + number1 + " - " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s);
        }
        else if (s.equals("*")) //If the user types *, the prgram will go through the following math
        {
          total = number1 * number2; //First inputted number is multiplied by the second number
          System.out.println("What is the total for the equation: " + number1 + " * " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s);
        }
        else if (s.equals("/")) //If the user types /, the prgram will go through the following math
        {
          total = number1 / number2; //First inputted number is divided by the second number
          System.out.println("What is the total for the equation: " + number1 + " / " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s);
        }
        else if (s.equals("^")) //If the user types ^, the prgram will go through the following math
        {
          total = Math.pow(number1, number2); //Second inputted number is put to the power of the first number
          System.out.println("What is the total for the equation: " + number1 + " ^ " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s);
        }
        else if (s.equals("%")) //This input will use the first number and modulue it by the second number
        { 
          total = number1 % number2; //First inputted number is modulued by the second number
          System.out.println("What is the total for the equation: " + number1 + " % " + number2 + "?");
          s = br.readLine(); //Reads the users input and s is now declared as that input
          usernum = Double.parseDouble(s); 
          
        }
        else
        {
          System.out.println("Math doesn't accept gibberish.");
        }
      }
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      
      do
      {
        try
        {
          if (usernum == total) //This statement occurs if the user number is correct
          {
            System.out.println("How'd you do that?!? You're correct! You're a math wizard!");
            usernum = 0;
            flag = false;
            guess2++; //Adds to the total amount of correct answers
          }
          else if (usernum != total) //This statement occurs if the user number isnt correct
          {
            
            System.out.println("Incorrect. Please try again. Use you're head!");
            s = br.readLine();
            usernum = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
            guess++; //Adds to the total amount of incorrect answers
          }
          else 
          {
            System.out.println("Math doesn accept gibberish!");
            flag = false;
          }
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      } while (flag);
      
      System.out.println("You have " + guess2 + " correct answer(s) so far! :D");
      System.out.println("You also have " + guess + " incorrect answer(s) so far! :(");
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
