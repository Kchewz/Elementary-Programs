/*
 * Program: AverageSleepCalculator.java
 * Author: Kenny Chyzewski
 * Description: A program that simplifies, an average of how many hours you've slept for.
 */
import java.io.*; //Required for command line input
public class SimpleMyTime
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program calculates how long you've slept throughout your life.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int sleep = 0;
    int age = 0;  
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      
      System.out.println("Years wondering earth.");
      
      s = br.readLine();
      age = Integer.parseInt(s);
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    
    sleep = 365 * 8; // If the person is to sleep 8 hours every night, for 365 days a year. Multiply those together to get 2,920 hours of sleep a year then multiply that by the users age.
    age = age * sleep;
    
    System.out.println("You have slept for approximately " + age + " hours in your life.");
  }
}
