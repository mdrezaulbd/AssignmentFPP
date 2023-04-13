package assignment5.problem1;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return this.width * this.height;

    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * this.width + 2 * this.height;

    }

}
