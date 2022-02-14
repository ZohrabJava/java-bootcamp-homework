package com.aca.day10;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    //Task1
    public static void toTen() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    //Task2
    public static void even20() {
        int i = 2;
        while (i < 21) {
            System.out.println(i);
            i += 2;
        }
    }

    //Task3
    public static void squaresNum(int num) {
        int i = 1;
        while ((i * i) <= num) {
            System.out.println(i * i);
            i += 1;
        }
    }

    //Task4
    public static void divisor(int n) {
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        System.out.println(i);
    }

    //Task5
    public static void powers(int n) {
        int i = 1;
        while (i < n) {
            System.out.println(i);
            i *= 2;
        }
    }

    //Task6
    public static void descending(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    //Task7
    public static void multiple(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }

    //Task8
    public static boolean power(int n) {
        if ((n & n - 1) == 0) {
            return true;
        }
        return false;
    }

    public static void powerCount() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.println("Input number");
            n = scanner.nextInt();
            sum++;
        } while (!power(n));
        System.out.println("Power of 2 is " + n);
        System.out.println("Count of input integer is " + sum);
    }

    //Task9
    public static void mathPow(int n) {
        int sum = 1;
        int i = 0;
        while (sum < n) {
            sum *= 2;
            i++;
        }
        System.out.println(i);
    }

    //Task10
    public static void ascii() {
        int n = 32;
        while (n <= 122) {
            int k = 0;
            while (k < 10) {
                System.out.print((char) n + " ");
                n++;
                k++;
            }
            System.out.println();
        }
    }

    //Task11
    public static void multiThree(int n) {
        int i = 1;
        while (i < n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    //Task12
    public static boolean fib(int n) {
        int j;
        for (int i = 2, k = 1; i <= n; j = i, i += k, k = j) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void operatorFib(int n) {
        if (fib(n)) {
            System.out.println(n * 3 / 4);
        } else {
            System.out.println("-1");
        }
    }

    //Task13
    public static void atlet(double x, double y) {
        int day = 1;
        for (; x < y; x += x * 0.1) {
            day++;
        }
        System.out.println(day);
    }

    //Task14
    public static void bank(int x, int p, int y) {
        int year = 0;
        for (; x <= y; x += x * p / 100) {
            year++;
        }
        System.out.println(year);
    }
    //Task15
    public static void maxToo(){
        Scanner scanner =new Scanner(System.in);
        int n;
        int max1=0,max2=0;
        do {
            n= scanner.nextInt();
            if(n>max1){
                max2=max1;
                max1=n;
            }
        }while (n!=0);
        System.out.println(max2);
    }
    //Task16
    public  static void whatTheNumber(int n){
        Scanner scanner=new Scanner(System.in);
        int inp;
        do {
            System.out.println("What the number?");
            inp= scanner.nextInt();
            if(inp>n){
                System.out.println("Too high, try again.");
            }else {
                System.out.println("Too low, try again.");
            }
        }while (inp!=n);
        System.out.println("Yes, you guessed the number");
    }
    //Task17
    public  static void sumDigit(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
//        toTen();
        //Task 2
//        even20();
        //Task 3
//        System.out.println("Input number");
//        int num =scanner.nextInt();
//        squaresNum(num);
        //Task 4
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        divisor(n);
        //Task 5
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        powers(n);
        //Task 6
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        descending(n);
        //Task 7
//        System.out.println("Input number");
//        int n= scanner.nextInt();
//        multiple(n);
        //Task 8
//        powerCount();
        //Task 9
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        mathPow(n);
        //Task10
//        ascii();
        //Task11
//        System.out.println("Input N");
//        int n= scanner.nextInt();
//        multiThree(n);
        //Task12
//        System.out.println("Input Fib n>1");
//        int n= scanner.nextInt();
//        operatorFib(n);
        //Task13
//        System.out.println("Input x");
//        double x= scanner.nextDouble();
//        System.out.println("Input y");
//        double y=scanner.nextDouble();
//        atlet(x,y);
        //Task14
//        System.out.println("Input x $");
//        int x = scanner.nextInt();
//        System.out.println("Input p %");
//        int p = scanner.nextInt();
//        System.out.println("Input y $");
//        int y = scanner.nextInt();
//        bank(x, p, y);
        //Task15
        maxToo();
        //Task16
//        Random random=new Random();
//        int n= random.nextInt(0,100);
//        whatTheNumber(n);
        //Task17
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        sumDigit(n);
    }
}
