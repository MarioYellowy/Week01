package CalculateAreaAndPerimeter.Triangles;

import CalculateAreaAndPerimeter.ShowInfo;

public class ScaleneTriangle extends Triangle implements ShowInfo {
    double sideA, sideB, sideC, areaResult, perimeterResult, s;

    @Override
     public void getArea() {
        s = (sideA + sideB + sideC) / 2.0;
        areaResult = Math.sqrt(s * (s -sideA) * (s -sideB) * (s -sideC));
    }

    @Override
    public void getPerimeter() {
        perimeterResult = sideA + sideB + sideC;
    }

    @Override
    public void showInfo() {
        System.out.println("Scalene triangle, " + "area: " + areaResult);
        System.out.println("perimeter: " + perimeterResult);
    }
    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            getArea();
            getPerimeter();
        } else {
            System.out.println("The triangle is not valid");
        }
    }
}
