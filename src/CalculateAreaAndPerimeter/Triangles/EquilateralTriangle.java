package CalculateAreaAndPerimeter.Triangles;

import CalculateAreaAndPerimeter.ShowInfo;

public class EquilateralTriangle extends Triangle implements ShowInfo {
    double side, areaResult, perimeterResult;

    @Override
    void getArea() {
        areaResult = ((side*side) * (Math.sqrt(3)) / 4) ;
    }

    @Override
    void getPerimeter() {
        perimeterResult = side*3;
    }

    @Override
    public void showInfo() {
        System.out.println("Equilateral triangle, " + "area: " + areaResult);
        System.out.println("perimeter: " + perimeterResult);
    }
    public EquilateralTriangle(double side) {
        this.side = side;
        getArea();
        getPerimeter();
    }
}
