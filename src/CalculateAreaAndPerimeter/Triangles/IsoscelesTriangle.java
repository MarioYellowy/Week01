package CalculateAreaAndPerimeter.Triangles;

import CalculateAreaAndPerimeter.ShowInfo;

public class IsoscelesTriangle extends Triangle implements ShowInfo {

    double side;
    double base;
    double areaResult;
    double perimeterResult;

    @Override
    void getArea() {
        areaResult = (1.0 / 4.0) * base * Math.sqrt(4 * (side * side) - (base * base));
    }

    @Override
    void getPerimeter() {
        perimeterResult = (side*2) + base;
    }
    public IsoscelesTriangle(double side, double base) {
        this.side = side;
        this.base = base;
        getArea();
        getPerimeter();
    }

    @Override
    public void showInfo() {
        System.out.println("Isosceles triangle, " + "area: " + areaResult);
        System.out.println("perimeter: " + perimeterResult);
    }
}
