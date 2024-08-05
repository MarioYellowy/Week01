import CalculateAreaAndPerimeter.Circle;
import CalculateAreaAndPerimeter.Rectangle;
import CalculateAreaAndPerimeter.Square;
import CalculateAreaAndPerimeter.Triangles.EquilateralTriangle;
import CalculateAreaAndPerimeter.Triangles.IsoscelesTriangle;
import CalculateAreaAndPerimeter.Triangles.ScaleneTriangle;

public class main {
    public static void main(String[] args) {
        //getQuadrant();
        //getFactorial();
        Rectangle rectangle1 = new Rectangle(15,7);
        rectangle1.showInfo();
        EquilateralTriangle triangle1 = new EquilateralTriangle(7);
        triangle1.showInfo();
        //IsoscelesTriangle triangle2 = new IsoscelesTriangle(6,4);
        //triangle2.showInfo();
        //ScaleneTriangle triangle3 = new ScaleneTriangle(4,3,7);
        //triangle3.showInfo();
        Circle circle1 = new Circle(5);
        circle1.showInfo();
        Square square1 = new Square(2);
        square1.showInfo();
    }
}
