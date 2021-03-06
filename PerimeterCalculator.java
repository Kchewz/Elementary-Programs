/*
 * Program: PerimeterCalculator.java
 * Author: Kenny Chyzewski
 * Description: A calculator to solve the perimeter of a rectangle/square.
 */
import java.io.*; //Required for command line input.
public class PerimeterCalc
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the perimeter with the given lengths and widths.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int length = 0;
    int width = 0;
    int perimeter = 0;
    
    System.out.println("Length in metres");
    
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      s = br.readLine();
      length = Integer.parseInt(s);
      
      System.out.println("Width in metres");
      
      s = br.readLine();
      width = Integer.parseInt(s);
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    perimeter = 2 * length + 2 * width; // The math is bein solved using the formula for perimeter.
    System.out.println("The perimeter is " + perimeter + " metres");
  }
}
