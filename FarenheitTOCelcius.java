/*
 * Program: FarenheitTOCelcius.java
 * Author: Kenny Chyzewski
 * Description: A calculator to convert Fahrenheit into Celsius.
 */
import java.io.*; //Required for command line input.
public class FtoC
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program converts Fahrenheit into Celsius.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    double fahrenheit = 0;
    double celsius = 0;
    
    System.out.println("Temperature in Degrees Fahrenheit");
    
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      s = br.readLine();
      fahrenheit = Integer.parseInt(s);
      
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    celsius = (fahrenheit - 32) * 0.56; // The math is being solved using the conversion Fahrenheit to Celsius.
    System.out.println("The temperature is " + celsius + " Degrees Celsius");
  }
}
