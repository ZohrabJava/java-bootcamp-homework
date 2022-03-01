package com.aca.day18;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    private double triangleAction(double s) {
        s /= 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    private double triangleAction() {
        return getSideA() + getSideB() + getSideC();
    }

    public void check() {
        if (TriangleValidator.rightTriangle(getSideA(),getSideB(),getSideC())) {
            System.out.println("Square is " + triangleAction(triangleAction()));
        } else {
            System.out.println("Perimeter is " + triangleAction());
        }
    }


}
