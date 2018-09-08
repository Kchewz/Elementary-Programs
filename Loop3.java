/*
 * Program: Loop3.java
 * Author: Kenny Chyzewski
 * Description: A program that will take a whole number and will print the corresponding number of * in the form of a square.
 */

//This is required for command line input
import java.io.*;
public class Loop3
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
    
    for(int out = 0; out < number; out++) //This loop sovles the number of * needed to be outpuuted per line using the check-do-math method. After its prints the correct amount of * it then proceeds to the next loop.
    {
      System.out.println("");
      for(int in = 0; in < number; in++) //Then this loop print the number of * as well but on the next line also using the check-do-math method. Once it it done that, it returns to the previous loop and repeates until it outputs the number of lines equvilant to the number the user inputed. Ex: 5 = 5 by 5 square.
      {
        System.out.print("*");
      }
    }
  }
}
