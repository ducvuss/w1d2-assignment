
public class AreaCalculator {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3);
        triangle.calculateArea();
        triangle.display();
        
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculateArea();
        rectangle.display();
        
        Circle circle = new Circle(3);
        circle.calculateArea();
        circle.display();
    }
}