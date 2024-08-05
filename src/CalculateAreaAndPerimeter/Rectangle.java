package CalculateAreaAndPerimeter;

public class Rectangle implements Figure, ShowInfo {
    double base;
    double height;
    double AreaResult;
    double PerimeterResult;

    @Override
    public void getArea() {
        AreaResult = base * height;
    }

    @Override
    public void getPerimeter() {
        PerimeterResult = (base * 2) + (height * 2);
    }

    @Override
    public void showInfo() {
        System.out.println("Rectangle, " + "area: " + AreaResult);
        System.out.println("perimeter: " + PerimeterResult );
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
        getArea();
        getPerimeter();
    }
}
