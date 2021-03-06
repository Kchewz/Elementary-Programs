/*
 * Program: CalculatorNecklace.java
 * Author: Kenny Chyzewski
 * Description: This program is calculates a problem with the necklace method.
 */

import java.io.*;//This is required for command line input
public class Calc2
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program creates a necklace with the two inputted numbers.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    int answer = 0; //This variable holds the total of the two inputs numbers
    int number1 = 0; //This variable holds the first value the user inputs
    int number2 = 0; //This variable holds the second value the user inputs
    int remainder1 = 0; //This variable holds the value after the first calculation
    int remainder2 = 0; //This variable holds the value after the second calculation
    int counter = 0; //This variable holds the total number of steps the necklace took from start to end
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
        
        System.out.println("Enter the first single whole number."); //The math begins with asking for the user's input
        s = br.readLine(); //Reads the users input and s is now declared as that input
        number1 = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
        
        System.out.println("Enter the second single whole number.");
        s = br.readLine(); //Reads the users input and s is now declared as that input
        number2 = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
      }
      //This will support the program if try fails
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      
      System.out.print(number1); //Prints the two numbers the user inputted and begins the necklace
      System.out.print(number2);
      
      answer = number1 + number2;
      remainder1 = answer % 10;
      System.out.print(remainder1); //Prints out the first calculation outcome
      counter++; //Adds to the number of steps
      answer = remainder1 + number2;
      remainder2 = answer % 10; 
      System.out.print(remainder2); //Prints out the second calculation outcome
      counter++; //Adds to the number of steps
      do
      {
        answer = remainder1 + remainder2;
        remainder1 = answer % 10;
        System.out.print(remainder1); //Prints out the third calculation outcome
        counter++; //Adds to the number of steps
        answer =  remainder1 + remainder2;
        remainder2 = answer % 10; 
        System.out.print(remainder2); //Prints out the fourth calculation outcome, how if the necklace hasnt closed, the loop repeats until it does
        counter++; //Adds to the number of steps
        
        if((number1 == remainder1) & (remainder2 == number2)) //If the numbers become equal to the numbers the user inputted from the start, the program will come to an end
        {
          flag = false;
        }
      } while ((remainder1 != number1) | (remainder2 != number2)); //If the program realizes that the necklace hasnt been closed/ solved yet, the loop will start from the beginning until it solves it
      
      System.out.println(" "); //Used to space out the next line, otherwise the next print statement would appear on the same line and the previous print statement
      System.out.println("The whole necklace from start to end took " + counter + " steps.");
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
        flag = true;
        number1 = 0; //Makes sure all the variables reset for the next use
        number2 = 0;
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
