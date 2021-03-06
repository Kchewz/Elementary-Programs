/*
 * Program: DigitBreaker.java 
 * Author: Kenny Chyzewski
 * Description: A program that splits three digit numbers into 3 single digit numbers.
 */
import java.io.*; //Required for command line input
public class DigitBreaker
  //^ This line of code opens the class
{
  public static void main(String[] args)
    //^ This line of code opens the main
  {
    System.out.println("This program will seperate any three digit number number into one digit numbers.");
    
    //All variable are kept at the top for neatnesss
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr);
    // ^Here, the InputStreamReader is combined with the BufferedReader into one variable (br)
    String s = ""; //user input
    int hundred = 0;
    int ten = 0;
    int one = 0;
    int number = 0;
    int remainder = 0; 
    
    //Now is where the calculations take place in the try and catch.
    try
      
    {
      
      System.out.println("Number that you'd like to spilt.");
      
      s = br.readLine();
      number = Integer.parseInt(s);
      
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    
    hundred = number / 100;      //Over the next few lines, the math is being solved by taking the user inputed number, dividing it by the singles digit number starting with hundred then ten and lastly one.
    remainder = number % 100;      
    ten = remainder /10;
    remainder = number % 10;
    one = remainder /1;
    remainder = number % 1; 
    
    System.out.println("The the number in single digits is " + hundred + "00, " + ten + "0 and " + one + ".");
  }
}
