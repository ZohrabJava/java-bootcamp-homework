package com.aca.day18;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (rangeSide(sideA)) {
            System.out.println("Wrong side " + sideA);
            return;
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (rangeSide(sideB)) {
            System.out.println("Wrong side " + sideB);
            return;
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (rangeSide(sideC)) {
            System.out.println("Wrong side " + sideC);
            return;
        }
        this.sideC = sideC;
    }

    public boolean rangeSide(double side) {
        return side < 1 || side > 20;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    private boolean triangleValid() {
        return this.sideA + this.sideB < this.sideC &&
                this.sideA + this.sideC < this.sideB &&
                this.sideB + this.sideC < this.sideA;
    }

    private boolean rightTriangle() {
        return getSideA() * getSideA() + getSideB() * getSideB() == getSideC() * getSideC() ||
                getSideC() * getSideC() + getSideB() * getSideB() == getSideA() * getSideA() ||
                getSideA() * getSideA() + getSideC() * getSideC() == getSideB() * getSideB();
    }

    private double triangleAction(double s) {
        s /= 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    private double triangleAction() {
        return getSideA() + getSideB() + getSideC();
    }

    public void check() {
        if (rightTriangle()) {
            System.out.println("Square is " + triangleAction(triangleAction()));
        } else {
            System.out.println("Perimeter is " + triangleAction());
        }
    }

    public static void main(String[] args) {
        Triangle one = new Triangle(3, 4, 5);
        one.check();
    }

}
