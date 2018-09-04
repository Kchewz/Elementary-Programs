/*
 * Program: CircumferenceCalculator.java
 * Author: Kenny Chyzewski
 * Description: A calculator to solve the circumference of a circle.
 */
import java.io.*; //Required for command line input
public class CirCircum
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the circumference with the given radius.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    double radius = 0;
    double circumference = 0;
    
    System.out.println("Radius in metres");
    
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      s = br.readLine();
      radius = Integer.parseInt(s);
      
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    circumference = 2 * Math.PI * radius; // The math is being solved using the formula for circle circumference.
    System.out.println("The area is " + circumference + " metres");
  }
}
