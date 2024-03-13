package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    public ShapeBuilder(ArrayList<Shape> shapes){
        this.shapes = shapes;

    }
    public void addShape(Shape s){
        shapes.add(s);
    }
    public double getTotalArea(){
        double totalArea = 0;
        for (Shape e : shapes){
            totalArea += e.getArea();
        }
        return totalArea;
    }

}
