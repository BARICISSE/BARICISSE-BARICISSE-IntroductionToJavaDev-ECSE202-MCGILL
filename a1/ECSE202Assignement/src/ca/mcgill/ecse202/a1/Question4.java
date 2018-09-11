package ca.mcgill.ecse202.a1;
import java.util.Scanner;
public class Question4 {
	/*
	 * write a program that prompts the user to enter the coordinates of two points (x1, y1) (x2, y2)
	 * and displays the line equation in the slope-intercept form: y = mx+b.
	 */

  public static void main(String[] args) {
 // Create a scanner object  
    Scanner input = new Scanner(System.in);
 
    // Prompt the user to enter the coordinates for 2 points   
    System.out.print("Enter the coordinates for two points: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    
// Background calculation for slope m and vertical intercept b
    double m = (y1-y2)/(x1-x2);
    double b = y1-m*x1;

// Display the results
    if (m==1 && b==0)
        System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = x");
    if (m==1 && b!=0)
        System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = x+"+ b+"");
    if (m!=1 && b==0)
        System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = "+ m +"x");
    if (m!=1 && b!=0)
        System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = "+ m +"x+"+ b+"");
  }
}
