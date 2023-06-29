
/**
 * The program calculates the radius, area and perimeter of the blocked circle,
 * and also of the circle that blocks the rectangle
 *
 * @author Gil Meshulami
 */

import java.util.Scanner;

public class Circle
{
   public static void main(String[]args)
   {
     Scanner scan = new Scanner (System.in);
     System.out.println("This program calculates the areas " + 
      "and the perimeters of the excircle and the incircle " +
      "of a given rectangle "); 
     System.out.println ("Please enter the two coordinates of the " + 
      "lest-upper point of the rectangle"); 
     
      //Receives numbers from the user
      int leftUpX = scan.nextInt();
      int leftUpY = scan.nextInt();
      int rightDownX = scan.nextInt();
      int rightDownY = scan.nextInt();
      
      //Calculations and formulas
      double h = leftUpY - rightDownY; 
      double inCircleRadius = h / 2;
      double inCirclePerimeter = 2 * Math.PI * inCircleRadius;
      double inCircleArea = Math.PI * Math.pow(inCircleRadius,2);
      
      double exCircleRadius = Math.sqrt(Math.pow((leftUpX-rightDownX),2)+
                Math.pow((leftUpY-rightDownY),2)) /2;
      double exCirclePerimeter = 2 * Math.PI * exCircleRadius;
      double exCircleArea = Math.PI * Math.pow(exCircleRadius,2);
      
      //Displays answers
     System.out.println("inCircle: Radius =" + inCircleRadius +
     " , Perimeter =" + inCirclePerimeter + " , Area =" + inCircleArea);
     
     System.out.println("exCircle: Radius =" + exCircleRadius +
     " , Perimeter =" + exCirclePerimeter + " , Area =" + exCircleArea);
      
      
   
      
   } // end of method main
} // end of class Circle
