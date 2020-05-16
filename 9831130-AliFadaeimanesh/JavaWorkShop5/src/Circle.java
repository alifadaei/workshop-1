//this class implements Circle Objects
public class Circle extends Shape{

    private double radius; //field radius

    public Circle(double radius){

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2.0);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle" + "[Radius: "+ radius + "]";
    }
}
