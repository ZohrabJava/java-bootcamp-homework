package com.aca.day20.task1;

import static java.lang.Math.PI;

public class Circle extends Shape{
    @Override
    protected double getPerimeter(double radius) {
        return 2*PI*radius;
    }

    @Override
    protected  double getArea(double radius) {
        return PI*radius*radius;
    }
}
