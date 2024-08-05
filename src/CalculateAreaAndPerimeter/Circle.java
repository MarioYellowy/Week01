package CalculateAreaAndPerimeter;

public class Circle implements Figure, ShowInfo{

    private static final double PI = 3.14;
    double radius, areaResult, perimeterResult;

    @Override
    public void getArea() {
        areaResult = PI * (radius * radius);
    }

    @Override
    public void getPerimeter() {
        perimeterResult = 2 * PI * radius;
    }

    @Override
    public void showInfo() {
        System.out.println("Circle, area: " + areaResult);
        System.out.println("perimeter: " + perimeterResult);
    }

    public Circle(double radius){
        this.radius = radius;
        getArea();
        getPerimeter();
    }
}
