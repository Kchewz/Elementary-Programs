/*
 * Program: Loop4.java
 * Author: Kenny Chyzewski
 * Description: A program that will take a whole number and will print the corresponding number of * in a hollow square.
 */

//This is required for command line input
import java.io.*;
public class Loop4
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This prints the number of * as the whole number inputted.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    String s = ""; //Create a string to support what the user inputs
    int number = 0;   
    
    try
    {
      //This wil print the following sentence when running the program
      System.out.println("Enter a number.");
      s = br.readLine();
      number = Integer.parseInt(s);
    }    
    //This will support the program if try fails
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    
    for(int counter = 0; counter < number; counter++) //This is the first loop. This loop and the next following loops all use the check-do-math method, it first solves how many * needs to be outputted.
    {
      System.out.print("*");
    }
    
    System.out.println("");
    
    for(int counter1 = 0; counter1 < number - 2; counter1++) //This loop solves how many * will be outputted for the head of the hollow square.
    {
      for(int counter2 = 0; counter2 < number; counter2++) //This loop, along with the following math underneath it, solves how many * will have to removed in order to make a even hollow square. Ex: user input 6. First two loops solve the result of a 6 by 6 square. Then this loop with math solves how to turn this 6 by 6 square with a hollow center.
      {
        //Over the next few lines of mathematical code, it solves how to find the hollowness of the square.
        if(counter2 == 0)
          System.out.print("*");
        else if (counter2 == number - 1)
          System.out.println("*");
        else
          System.out.print(" ");
      }
    }    
    for(int counter3 = 0; counter3 < number; counter3++) //This loop solves how many * will be outputted for the bottom of the hollow square.
    {
      System.out.print("*");
    }    
  }
}
