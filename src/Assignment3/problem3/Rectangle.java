package Assignment3.problem3;

final public class Rectangle {

    private  final double length;
    private  final double width;
    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double computeArea()
    {

     return length*width;
    }
}

