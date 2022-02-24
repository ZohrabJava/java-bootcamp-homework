package com.aca.day17;

import static java.lang.Math.PI;

public class Day17 {
    //Task1
    public static void add(int a, int b) {
        System.out.println("Number of parameters.");
    }

    public static void add(int a, float b) {
        System.out.println("Data types of parameters");
    }

    public static void add(float a, int b) {
        System.out.println("Sequence of parameters");
    }

    //Task2
    public static int funcs(int a) {
        return a;
    }

    //    public static float funcs(int a){
//        return a;
//    }
    //Task3
    public static int func(int a) {
        return a;
    }

    public static float func(float a) {
        return a;
    }

    //Task4
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }

    public static void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }

    public static void print(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }

    //Task5
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == argument && i == index) {
                return true;
            }
        }
        return false;
    }

    //Task6
    public static double square(int r) {
        return PI * r * r;
    }

    public static int square(int a, int b) {
        return a * b;
    }

    public static double square(float a) {
        return a * a;
    }
    //Task7

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        if (max(a, b) > c) {
            return max(a, b);
        }
        return c;
    }

    public static int max(int a, int b, int c, int d) {
        if (max(a, b, c) > d) {
            return max(a, b, c);
        }
        return d;
    }

    //Task8
    public static double distance(int x1, int x2, int x3, int x4) {
        return Math.sqrt((x1 - x3) * (x1 - x3) + (x2 - x4) * (x2 - x4));
    }

    public static double distance(int x1, int x2) {
        return Math.sqrt(x1 * x1 + x2 * x2);
    }
    //Task9
    public static void fahrenheitCelsius(float celsius, int choice){
        if (choice==1){
            System.out.println((int)celsius+ " celsius is "+ (int) ((celsius*5/9)+32)+" fahrenheit");

        }
        else{
            System.out.println(((double) celsius+ " celsius is "+ (double) ((celsius*5/9)+32)+" fahrenheit"));
        }
    }
    public static void fahrenheitCelsius(int choice, float fahrenheit){
        if (choice==1){
            System.out.println((int)fahrenheit+ " fahrenheit is "+ (int) ((fahrenheit-32)*5/9)+" celsius");

        }
        else{
            System.out.println(((double) fahrenheit+ " fahrenheit is "+ (double) ((fahrenheit-32)*5/9)+" celsius"));
        }
    }
    //Task10
    public static int reminder(int a){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public static int reminder(int a,int b){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a/=10;
        }
        return sum%b;
    }

    public static void main(String[] args) {
        //Task1
//        add(5,6);
//        add(5,6f);
//        add(5f,6);
        //Task2
//        System.out.println(funcs(5));
        //Task3
//        System.out.println(func(5));
//        System.out.println(func(5f));
        //Task4
//        int[]arr=new int[5];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=i;
//        }
//        print(arr);
        //Task5
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        System.out.println(search(arr));
//        System.out.println(search(arr, 3));
//        System.out.println(search(arr, 2, 2));
        //Task6
//        System.out.println(square(2));
//        System.out.println(square(3.2f));
//        System.out.println(square(4, 5));
        //Task7
//        System.out.println(max(1,10));
//        System.out.println(max(2,7,4));
//        System.out.println(max(4,10,3,20));
        //Task8
//        System.out.println(distance(3, 4));
//        System.out.println(distance(4, 5, 7, 15));
        //Task9
//        fahrenheitCelsius(32.0F,1);
//        fahrenheitCelsius(1,10f);
        //Task10
//        System.out.println(reminder(112));
//        System.out.println(reminder(145,3));
    }
}
