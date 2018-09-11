package ca.mcgill.ecse202.a1;
/*
 * Write a program that  promptsthe user to enter the width and height of a rectangle and displays the:
 * perimeter
 * area
 * length of diagonal
 */
import java.util.Scanner;
public class Question2 {

  public static void main(String[] args) {
 // Create a scanner object
    Scanner input = new Scanner(System.in);
    
 // Prompt the user to input a width and height
    System.out.print("Enter the width and height of a rectangle: ");
    double width = input.nextDouble();
    double height = input.nextDouble();
 
 // Calculate the perimeter, area, the length of diagonal
    double perimeter = 2*(width + height);
    double area = width*height;
    double lengthOfDiagonal = Math.sqrt(width*width + height*height);
    
 // Display results
    System.out.println("The perimeter is " + perimeter);
    System.out.println("The area is " + area);
    System.out.println("The length of the diagonal is " + lengthOfDiagonal);
  }

}
