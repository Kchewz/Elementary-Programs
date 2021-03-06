/*
 * Program: CircleCalculator.java
 * Author: Kenny Chyzewski
 * Description: A calculator to solve the area of a circle.
 */
import java.io.*; //Required for command line input
public class CircCalc
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates the area with the given radius.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    double radius = 0;
    double area = 0;
    
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
    area = Math.PI * radius * radius; // The math is being solved by using by using the formula for area.
    System.out.println("The area is " + area + " metres");
  }
}
