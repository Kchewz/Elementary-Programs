/*
 * Program: ClassAvgCalculator.java
 * Author: Kenny Chyzewski
 * Description: This program calculates the classes average.
 */

import java .io.*;//This is required for command line input
public class Calc3
{
  public static void main(String[] args)
  {
    System.out.println("This program calculates a class average and tells you how many students are passing and failing in the class, with the inputted students marks.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    double markA = 80; //This variable holds the number of students with an 80% in class
    double markB = 70; //This variable holds the number of students with an 70% in class
    double markC = 60; //This variable holds the number of students with an 60% in class
    double markD = 50; //This variable holds the number of students with an 50% in class
    double markF = 40; //This variable holds the number of students with an 40% in class
    double students = 0; //This variable holds the number of students in the class
    double total = 0; //This variable holds the total amount of marks
    int pass = 0; //This variable holds the value of the students passing
    int fail = 0; //This variable holds the value of the students failing
    double average = 0; //This variable holds the value of the average of the class
    boolean flag = true; //This variable holds the loop as true or flase (repeat or end)
    
    do
    {
      try
      {
        System.out.println("Type help if you need help; if not just press enter"); //Asks the user if they need help
        s = br.readLine(); //Reads the users input and s is now declared as that input
        if (s.equals ("help")) //If the user types help, the system will print the line within the if statement
        {
          System.out.println("With the entered amount of students and each of their individual marks, this program caluclates the class average and the amount of students failing and passing.");
        }
        System.out.println("Enter the number of students in the class."); //The math begins with asking for the user's input
        s = br.readLine(); //Reads the users input and s is now declared as that input
        students = Integer.parseInt(s); //The user input is parsed, and the variable is now assigned a value
      }
      //This will support the program if try fails
      catch (IOException ex)
      {
        ex.printStackTrace();
      }
      
      for (int counter = 0; counter < students; counter++)
        
      {
        System.out.println("Enter a student's mark. (A, B, C, D, or F)");
        try
        {
          s = br.readLine(); //Reads the users input and s is now declared as that input
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
        if (s.equals("A")) //If the user types A, the prgram will go through the following math
        {
          pass++; //Adds to the number of students passing
          total = total + 80; //Adds 80 to the total marks for every student with a A
        }
        else if (s.equals("B")) //If the user types B, the prgram will go through the following math
        { 
          pass++; //Adds to the number of students passing
          total = total + 70; //Adds 70 to the total marks for every student with a B
        }
        else if (s.equals("C")) //If the user types C, the prgram will go through the following math
        {
          pass++; //Adds to the number of students passing
          total = total + 60; //Adds 60 to the total marks for every student with a C
        }
        else if (s.equals("D")) //If the user types D, the prgram will go through the following math
        {
          pass++; //Adds to the number of students passing
          total = total + 50; //Adds 50 to the total marks for every student with a D
        }
        else if (s.equals("F")) //If the user types F, the prgram will go through the following math
        { 
          fail++; //Adds to the number of students failing
          total = total + 40; //Adds 40 to the total marks for every student with a F
        }
        else //If the user types a character that has not been listed
        {
          System.out.println("The character you typed is invalid");
        }
      }
      
      average = total / students; //Solves the class average but taking all the grades and dividing it by the total number of students
      System.out.println("The class average is " + average + "%"); //This prints the class' average
      System.out.println("The amount of students passing is " + pass++); //This prints the total of the students passing in the class
      System.out.println("The amount of students failing is " + fail++); //This prints the total of the students failing in the class
      
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
        pass = 0;
        fail = 0;
      }
      else //User did not input a proper answer and the program ends
      {
        System.out.println("The character you typed is invalid");
        flag = false;
      }   
    } while (flag);
  }
}
