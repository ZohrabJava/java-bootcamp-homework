package com.aca.day8;

import java.util.Random;
import java.util.Scanner;

public class Day8 {
    //Task1
    public static void age(int age) {
        if (age >= 18) {
            System.out.println("You are  the right to vote.");
        } else {
            System.out.println("You have no right to vote.");
        }
    }

    //Task2
    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Input number is an even number");
        } else {
            System.out.println("Input number is an odd number");
        }

    }

    //Task3
    public static void rand() {
        Random rand = new Random();
        System.out.println("Random number 2 to 7");
        int r = Math.abs(rand.nextInt() % 6) + 2;
        System.out.println(r);
    }

    //Task4
    public static void multi5(int num) {
        if (num % 5 == 0) {
            System.out.println("Number is a multiple of a 5");
        } else {
            System.out.println("Number is not a multiple of 5");
        }
    }

    //Task5
    public static void max3(int n1, int n2, int n3) {
        int max = n1;
        if (max < n2) {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        System.out.println("Max number - " + max);
    }

    //Task6
    public static void type(float num) {
        if (Math.abs(num) > 0 && Math.abs(num) < 1) {
            System.out.println("Small");
        } else if (Math.abs(num) >= 1000000) {
            System.out.println("Large");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //Task7
    public static void day(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    //Task8
    public static void iceCream(int k) {
        if (k == 7 || k == 1 || k == 2 || k == 4) {
            System.out.println("You can not buy");
        } else {
            System.out.println("You can  buy");
        }
    }

    //Task9
    public static void leapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        if (leap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    //Task8
    public static void randn(int n) {
        System.out.println("Your number is " + n);
        System.out.println((n > -1000 && n < 1000) && (n % 3 == 0 || n % 5 == 0));
    }

    //Task9
    public static void legal(int a, int b) {
        System.out.println("a > 10 and b is not equal to 10");
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a > 10 && b == 10) {
            System.out.println("a is legal b is illegal");
        } else if (a <= 10 && b != 10) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
        System.out.println("both a and b is positive");
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else if (a > 0 && b <= 0) {
            System.out.println("a is legal b is illegal");
        } else if (a <= 0 && b > 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
        System.out.println("both a and b is negative ");
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else if (a < 0 && b >= 0) {
            System.out.println("a is legal b is illegal");
        } else if (a >= 0 && b < 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
        System.out.println("a > 10 b < 1 both of them are odd");
        if ((a > 10 && a % 2 == 1) && (b < 1 && b % 2 == 1)) {
            System.out.println("Both a and b legal");
        } else if ((a > 10 && a % 2 == 1) && (b >= 1 || b % 2 == 0)) {
            System.out.println("a is legal b is illegal");
        } else if ((a <= 10 || a % 2 == 0) && (b < 1 && b % 2 == 1)) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
        System.out.println("a is a multiple of 5 OR b is a multiple of 5");
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
        System.out.println("a is not a multiple of 5 but b is a multiple of 5");
        if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 != 0 && b % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("a is illegal b is illegal");
        }
    }

    //Task10
    public static void multi7(int a, int b) {
        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && a > b) {
            if (b % 2 == 1) {
                for (int i = b + 2; i < a; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = b + 1; i < a; i += 2) {
                    System.out.print(i + " ");
                }
            }
        } else if (a > b) {
            if (b % 2 == 0) {
                for (int i = b + 2; i < a; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = b + 1; i < a; i += 2) {
                    System.out.print(i + " ");
                }
            }
        } else {
            if (a % 2 == 0) {
                for (int i = a + 2; i < b; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = b + 1; i < a; i += 2) {
                    System.out.print(i + " ");
                }
            }

        }
    }

    //Task11
    public static void quarter(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        if ((x1 > 0 && y1 > 0) && (x2 > 0 && y2 > 0) && (x3 > 0 && y3 > 0) && (x4 > 0 && y4 > 0)) {
            System.out.println("Same quarter");
        } else if ((x1 > 0 && y1 < 0) && (x2 > 0 && y2 < 0) && (x3 > 0 && y3 < 0) && (x4 > 0 && y4 < 0)) {
            System.out.println("Same quarter");
        } else if ((x1 < 0 && y1 > 0) && (x2 < 0 && y2 > 0) && (x3 < 0 && y3 > 0) && (x4 < 0 && y4 > 0)) {
            System.out.println("Same quarter");
        } else if ((x1 < 0 && y1 < 0) && (x2 < 0 && y2 < 0) && (x3 < 0 && y3 < 0) && (x4 < 0 && y4 < 0)) {
            System.out.println("Same quarter");
        } else {
            System.out.println("Not in the same quarter");
        }
    }

    //Task12
    public static void triangel(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Degenerate triangle");
        } else {
            System.out.println("Non-degenerate triangle");
        }
    }

    //Task13
    public static void equalsTree(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("3");
        } else if (a == b || b == c || a == c) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }

    //Task14
    public static void decisions(int a, int b, int c) {

        if (b * b - 4 * a * c > 0) {
            System.out.println("x1=" + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
            System.out.println("x2=" + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        } else if (b * b - 4 * a * c == 0) {
            System.out.println("x=" + (-b / (2 * a)));
        } else {
            System.out.println("Can't be");
        }
    }
    //Task15
    public static  void sortThree(int a,int b,int c){
        if (a<=b && a<=c && b<=c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if(a<=b && a<=c && b>c){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if(b<=a && b<=c && a<=c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if(b<=a && b<=c && a>c){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if(c<=a && c<=b && a<=b){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else if(c<=a && c<=b && a>b){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
//        System.out.println("Input your age");
//        int age= scanner.nextInt();
//        age(age);
        //Task 2
//        System.out.println("Input number");
//        int num=scanner.nextInt();
//        evenOdd(num);
        //Task 3
//       rand();
        //Task 4
//        System.out.println("Input number");
//        int num = scanner.nextInt();
//        multi5(num);
        //Task 5
//        System.out.println("Input number 1");
//        int n1 = scanner.nextInt();
//        System.out.println("Input number 2");
//        int n2 = scanner.nextInt();
//        System.out.println("Input number 3");
//        int n3 = scanner.nextInt();
//        max3(n1,n2,n3);
        //Task 6
//        System.out.println("Input number");
//        float num = scanner.nextFloat();
//        type(num);
        //Task 7
//        System.out.println("Input number 1 to 7");
//        int day = scanner.nextInt();
//        day(day);
        //Task 8
//        System.out.println("Input k");
//        int k = scanner.nextInt();
//        iceCream(k);

        //Task 9
//        System.out.println("Input Year");
//        int year=scanner.nextInt();
//        leapYear(year);

        //Task8
//        Random random=new Random();
//        int n=random.nextInt(-2000,2000);
//        randn(n);

        //Task9
//        System.out.println("Input a");
//        int a = scanner.nextInt();
//        System.out.println("Input b");
//        int b = scanner.nextInt();
//        System.out.println("a > 10 and b is not equal to 10");
//        legal(a, b);

        //Task10
//        System.out.println("Input a");
//        int a=scanner.nextInt();
//        System.out.println("Input b");
//        int b=scanner.nextInt();
//        multi7(a,b);

        //Task11
//        System.out.println("Input x1 y1");
//        int x1 = scanner.nextInt();
//        int y1 = scanner.nextInt();
//        System.out.println("Input x2 y2");
//        int x2 = scanner.nextInt();
//        int y2 = scanner.nextInt();
//        System.out.println("Input x3 y3");
//        int x3 = scanner.nextInt();
//        int y3 = scanner.nextInt();
//        System.out.println("Input x4 y4");
//        int x4 = scanner.nextInt();
//        int y4 = scanner.nextInt();
//        quarter( x1, x2, x3, x4, y1,  y2, y3, y4);

        //Task12
//        System.out.println("Input a");
//        int a=scanner.nextInt();
//        System.out.println("Input b");
//        int b=scanner.nextInt();
//        System.out.println("Input c");
//        int c=scanner.nextInt();
//        triangel(a,b,c);

        //Task13
//        System.out.println("Input a");
//        int a = scanner.nextInt();
//        System.out.println("Input b");
//        int b = scanner.nextInt();
//        System.out.println("Input c");
//        int c = scanner.nextInt();
//        equalsTree(a,b,c);

        //Task14
//        System.out.println("Input a");
//        int a = scanner.nextInt();
//        System.out.println("Input b");
//        int b = scanner.nextInt();
//        System.out.println("Input c");
//        int c = scanner.nextInt();
//        decisions(a, b, c);

        //Task15
//        System.out.println("Input a");
//        int a= scanner.nextInt();
//        System.out.println("Input b");
//        int b= scanner.nextInt();
//        System.out.println("Input c");
//        int c= scanner.nextInt();
//        sortThree(a,b,c);


    }
}
