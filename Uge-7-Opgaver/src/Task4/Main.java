package Task4;

import Task3.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeBuilder shapeBuilder = new ShapeBuilder(new ArrayList<>());

        Shape circle1 = new Circle(10);
        Shape square = new Square(10);
        Shape square1 = new Square(10);

        shapeBuilder.addShape(circle1);
        shapeBuilder.addShape(square);
        shapeBuilder.addShape(square1);

        System.out.println(shapeBuilder.getTotalArea());










    }
}
