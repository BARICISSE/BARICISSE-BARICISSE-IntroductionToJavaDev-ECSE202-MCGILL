package ca.mcgill.ecse202.a1;
import java.util.Scanner;
public class Question3 {
	/*
	 * Write a program that prompts the user to enterthe coordinates of a two points
	 * (x1, y1) (x2, y2) and displays the slope of the line connects the two points.
	 */

  public static void main(String[] args) {
 // Create a scanner object
    Scanner input = new Scanner(System.in);
    
 // Prompt the user to input the coordinates
    System.out.print("Enter the coordinates for two points: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
  
 // Calculate the slope
    double slope = (y1-y2)/(x1-x2);
    
 // Display the result
    System.out.println("The slope for the line that connects two points ("+ x1 +", "+ y1 +") and ("+ x2 +", "+ y2 +") is " + slope);

  }

}
