/*
 * Program: TriangularAreaCalculator.java
 * Author: Kenny Chyzewski
 * Description: A calculator to solve the area of a triangle.
 */

import java.io.*; //Required for command line input
public class TriArea
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the area with the given base and height.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int base = 0;
    int height = 0;
    int area = 0;
    
    System.out.println("Base in metres");
    
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      s = br.readLine();
      base = Integer.parseInt(s);
      
      System.out.println("Height in metres");
      
      s = br.readLine();
      height = Integer.parseInt(s);
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    area = base * height / 2; //The math is being solved using the formula for area.
    System.out.println("The area is " + area + " metres");
  }
}
    
