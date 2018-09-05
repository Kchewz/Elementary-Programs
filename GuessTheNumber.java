/*
 * Program: GuessTheNumber.java
 * Author: Kenny Chyzewski
 * Description: This program generates a random number between 1 and 10.
 */

import java.io.*;//This is required for command line input
public class Random1
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program tests your guessing capabilities with Billy's random number.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    int number = 1; //This variable hold the random generated number
    int usernum = 0; //This variable holds the user inputs
    int guess = 1; //This variable holds the total amound of incorrect guesses
    int guess2 = 10; //This variable tells the user he has this many guesses remaining
    boolean flag = true; //This variable holds the loop as true or flase (repeat or end)
    
    
    
    do
    {
      try
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement
        {
          System.out.println("You, the user will guess a random number that Billy is thinking of between 1 and 10."); 
          System.out.println(" "); //Seperates help from the actual gameplay
        }
        System.out.println("You and Billy are in a room. There is 10 lollipops on a table and the last ten on earth. Billy offers you a gamble for them.");
        System.out.println("He asks you, Bruh, you know you want these lollipops. Theyre BANANA SPLIT FLAVOURED! Guess the number im thinking of from 1 to 10 and the lollipops are yours.");
        System.out.println("You have 10 guesses. However, for each wrong guess youll lose a lollipop. What is the number im thinking of?");
        s = br.readLine(); //Reads the users input and s is now declared as that input
        usernum = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
      }
      
      //This will support the program if try fails
      catch (IOException ex)
      {
        ex.printStackTrace();
      }      
      
      number = (int)(Math.random() * 10) + 1; //Generates a random number between 1 and 10
      
      do
      {
        try
        {
          for (int counter = 0; counter <= 9; counter++) //Makes the user have a total amount of 10 guesses
          {
            if (usernum > 10) //If the user types a number over 10
            {
              System.out.println("I SAID NUMBERS FROM 1 TO 10!!");
              usernum = 0;
              guess++; //Adds to the total amount of incorrect answers
            }
            else if (usernum == number) //This statement occurs if the user number is correct
            {
              System.out.println("How on earth did you guess my number?!?! You cheated!!");
              flag = false;
              counter = 10; //Sets the counter to 10 so the loop ends
            }
            else if (usernum != number) //This statement occurs if the user number isnt correct
            {
              guess2--; //Subtracts the users guesses for each wrong guess
              System.out.println("Ha your foolish. Dont cry you still have " + guess2 + " guesses. Guess Again?!?");
              s = br.readLine();
              usernum = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
              guess++; //Adds to the total amount of incorrect answers
            }
            else if (counter == 10) //Sets the counter to 10 so the loop ends
            {
              flag = false;
            }
            else
            {
              System.out.println("You started speaking gibberish, Billy slapped you and ran off with all the lollipops.");
              flag = false;
            }
          }
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      } while (guess == 1);
      
      System.out.println(" "); //Used to space out the next line, otherwise the next print statement would appear on the same line and the previous print statement
      if (usernum == number)  //If the user does end up getting the correct answer
      {
        System.out.println("It took you " + guess + " try(ies) to guess Billy's number.");
        System.out.println("Billy got excitedyes with his " + guess + " lollipop(s) and went home.");
        guess = 10 - guess; //Uses this math to find how many guesses were left and lollipops earned.
        System.out.println("You managed to go home with " + guess + " lollipop(s)!");        
        flag = false;
      }
      else if (guess == 10) //If the user doesnt end up getting the correct answer
      {
        System.out.println("You never guess Billy's number and didnt get any lollipops.");
        System.out.println("You managed to get 0 lollipops. Try not to cry too much.");  
      }
      
      System.out.println(" ");
      System.out.println("Would you like to play again?"); //Asks the user if they would like to use the program again from the start
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
        usernum = 0;
        number = 1; 
        guess = 1;
        guess2 = 10;
      }
      else //User did not input a proper answer and the program ends
      {
        System.out.println("The character you typed is invalid");
        flag = false;
      }        
    } while (flag);
  }
}
