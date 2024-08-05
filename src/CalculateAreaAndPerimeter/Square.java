package CalculateAreaAndPerimeter;

public class Square implements Figure, ShowInfo{

    double side, areaResult, perimeterResult;
    @Override
    public void getArea() {
        areaResult = side*side;
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
    public Square (double side) {
        this.side = side;
        getArea();
        getPerimeter();
    }
}
