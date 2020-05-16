import java.util.ArrayList;

/**
 * this class contains a list of shapes
 * and has different methods for adding and managing shapes
 */
public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void drawAll(){
        for (Shape shape :
                shapes) {
         shape.draw();
        }
    }

    public void printAll(){
        for (Shape shape:
             shapes) {
            shape.draw();
        }
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

}
