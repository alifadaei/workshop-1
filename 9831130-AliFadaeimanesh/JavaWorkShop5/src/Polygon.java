import java.util.ArrayList;

public abstract class Polygon extends Shape {
    public Polygon(Double... args){
        super(args);
    }

    @Override
    public double calculatePerimeter(){
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        String str =  getClass().getName() + ":: ";
        for(int i=0 ; i<sides.size(); i++){
            str+= String.format("side %d: %d",i+1, sides.get(i));
        }
        return str;
    }
}
