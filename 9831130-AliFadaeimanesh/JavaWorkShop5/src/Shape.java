import java.util.ArrayList;

public abstract class Shape {
    protected ArrayList<Double> sides = new ArrayList<>();

    public Shape(Double... args){
        for (double arg: args){
            sides.add(arg);
        }
    }
    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public void draw(){
        System.out.println(getClass().getName());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
