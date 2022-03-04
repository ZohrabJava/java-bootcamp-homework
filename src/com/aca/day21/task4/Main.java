package com.aca.day21.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        String[] arr = {circle.area(), circle.perimeter(), rectangle.area(), rectangle.perimeter(), square.area(), square.perimeter()};
        System.out.println(Arrays.toString(arr));
    }
}
