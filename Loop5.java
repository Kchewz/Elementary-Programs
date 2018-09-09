/*
 * Program: Loop5.java
 * Author: Kenny Chyzewski
 * Description: A program that will take a whole number and will print the corresponding number of * in the form of a right angle triangle.
 */

//This is required for command line input
import java.io.*;
public class Loop5
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
    
    for(int loop = 0; loop < number; loop++) //This loop uses the check-do-math method to solve how many * are to be outputted.
    {
      System.out.println(" ");      
      for(int tri = 0; tri < loop; tri++) //This loop also uses the check-do-math method, however it uses the number the user input and print one line at a time a number slowly rising to the user inputed number. Ex: 5 so the output will be 1,2,3,4 then 5.       
        System.out.print("*");
    }
  }
}
