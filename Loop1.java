/*
 * Program: Loop1.java
 * Author: Kenny Chyzewski
 * Description: A program that will take a whole number and will print the corresponding number of * in a horizontal line.
 */

//This is required for command line input
import java.io.*;
public class Loop1
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
    for (int loop = 0; loop < number; loop++) //This loop uses the check-do-math method to solve how many * are needed to be outputted.
      
      System.out.print("*"); //Must be .print in order to print results horizontally.
  }
}
