package com.aca.day18;

public class TriangleValidator {
    private TriangleValidator() {

    }

    public static boolean rangeSide(double side) {
        return side >= 1 && side <= 20;
    }

    public static boolean triangleValid(double a, double b, double c) {
        return a + b <= c ||
                a + c <= b ||
                b + c <= a;
    }

    public static boolean rightTriangle(double a, double b, double c) {
        return a * a + b * b == c * c ||
                c * c + b * b == a * a ||
                a * a + c * c == b * b;
    }
}
