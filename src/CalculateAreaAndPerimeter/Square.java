package CalculateAreaAndPerimeter;

public class Square extends Rectangle{

    double side, areaResult, perimeterResult;
    @Override
    public void getArea() {
        areaResult = side*height;
    }

    @Override
    public void getPerimeter() {
        perimeterResult = side*4;
    }

    @Override
    public void showInfo() {
        System.out.println("Square, area: " + areaResult);
        System.out.println("perimeter: " + perimeterResult);
    }

    public Square(double side, double height) {
        super(side, height);
        this.side = side;
        this.height = height;
        getArea();
        getPerimeter();
    }
}
