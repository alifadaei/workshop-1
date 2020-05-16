import java.util.ArrayList;

public class Triangle extends Polygon {

    public Triangle(Double... sides) {
        super(sides);
    }


    @Override
    public double calculateArea() {
        return 0;
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean isEquilateral(){
        boolean isEqui = sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2);
        return isEqui;
    }

    @Override
    public String toString() {
        return "Triangle" + sides.toString();
    }
}
