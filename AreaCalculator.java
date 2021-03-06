/*
 * Program: AreaCalculator.java
 * Author: Kenny Chyzewski
 * Description: A calculator to solve the area of a rectangle/square
 */
import java.io.*; //Required for command line input
public class AreaCalc
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the area with the given lengths and widths.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int length = 0;
    int width = 0;
    int area = 0;
    
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
    area = length * width; // The math is being solved by using the formulae for area.
    System.out.println("The area is " + area + " metres");
  }
}





