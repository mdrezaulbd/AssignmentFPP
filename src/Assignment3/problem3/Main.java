package Assignment3.problem3;

import java.util.Scanner;

public class Main {

    public static void main (String []args)
    {

        double length,width;
        Scanner sc=new Scanner(System.in );

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String input=sc.nextLine();
        if (input.equalsIgnoreCase("R"))
        {
            Scanner scRect=new Scanner(System.in );
            System.out.println("Enter the length of Rectangle:");

            length= scRect.nextDouble();
            System.out.println("Enter the width of Rectangle:");
            width= scRect.nextDouble();
            Rectangle rectangle=new Rectangle(length,width);
            System.out.println("The Area of rectangle is :"+rectangle.computeArea());


        }

        else  if (input.equalsIgnoreCase("C"))
        {
            Scanner scCircle=new Scanner(System.in );
            System.out.println("Enter the radious of circle:");

            length= scCircle.nextDouble();

            Circle circle=new Circle(length);
            System.out.println("The Area of circle is :"+circle.computeArea());


        }

        else
        {
            Scanner scRect=new Scanner(System.in );
            System.out.println("Enter the base of Triangle:");

            length= scRect.nextDouble();
            System.out.println("Enter the height of Triangle:");
            width= scRect.nextDouble();
            Triangle triangle =new Triangle(length,width);
            System.out.println("The Area of Triangle is :"+triangle.computeArea());


        }
    }
}
