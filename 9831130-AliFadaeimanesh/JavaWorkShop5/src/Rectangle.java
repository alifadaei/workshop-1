import jdk.jfr.Percentage;

import java.util.ArrayList;

public class Rectangle extends Polygon {
    public Rectangle(Double... sides){
        super(sides);
    }



    @Override
    public double calculateArea() {
        double area = sides.get(0)*sides.get(1);
        return area;
    }

    public boolean isSquare(){
        double side1 = sides.get(0);
        double side2 = sides.get(1);
        if(side1==side2)
            return true;
        return false;
    }

    @Override
    public String toString() {
        String str = "Rectangle" + sides.toString();
        return str;
    }
}
