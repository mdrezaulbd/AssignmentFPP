package assignment5.problem1;

public class Main {

    public  static void main(String [] args)
    {
      Shape []shapes=new Shape[5];

      shapes[0]=new Rectangle("blue",2.0,2.0);
      shapes[1]=new Circle("Red",2.0);
      shapes[2]=new Square("gren",2.0);
      shapes[3]=new Circle("Green",3.0);
      shapes[4]=new Square("gray",4.0);

      printTotal(shapes);


    }

    public static void printTotal(Shape[] shapes)
    {
        double totalArea=0.0;
        double totalPerimeter=0.0;
        for(Shape s:shapes)
        {
            totalArea=totalArea+s.calculateArea();
            totalPerimeter=totalPerimeter+ s.calculatePerimeter();

        }

        System.out.println("Total Area:"  +totalArea);

        System.out.println("Total Perimeter:"+totalPerimeter);
    }
}
