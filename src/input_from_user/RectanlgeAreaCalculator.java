package input_from_user;

import java.util.Scanner;

public class RectanlgeAreaCalculator {

    public static void main(String[] args) {


        // perimeter of a rectangle 2(a+b);
        //write a program that will find the perimeter of a rectangle
        // both a and b given by user



        //Write program to find an area of a circle
        // radius should be given by user


        //write a program to convert dollars to mexican pesos
        // amount of dollars should given by user

        // write a prog
          /*
        Please calculate the area of a triangle. The user should enter width and height of the right triangle.
        The formula is varied for different types of triangle, but the most common formula that was used as
        Area=(Height x Base) /2
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        double w = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        double area = (h * w) / 2;
        System.out.printf("Area of triangle is: %s", area);
    }


    }

