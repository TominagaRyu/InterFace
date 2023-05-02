package inface;

public class ShapeTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5,4);
        shapes[1] = new Rectangle(4,3);
        shapes[2] = new Circle(2);

        double totalArea = getTotalArea(shapes);
        System.out.println("すべての面積は：" + totalArea);
    }

    public static double getTotalArea(Shape[] shapes){
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
