package com.aca.day11;

import java.util.Scanner;

public class Day11 {
    //Task1
    public static void allEven(int a, int b) {
        for (; a <= b; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }

    //Task2
    public static void divided(int a, int b, int c, int d) {
        for (; a <= b; a++) {
            if (a % d == c) {
                System.out.println(a);
            }
        }
    }

    //Task3
    public static void squares(int a, int b) {
        for (; a <= b; a++) {
            if (Math.sqrt(a) == (int) Math.sqrt(a)) {
                System.out.println(a);
            }
        }
    }

    //Task4
    public static int digitNum(int x, int d) {
        if (d > 9 || d < 0) {
            return -1;
        }
        int sum = 0;
        for (; x != 0; x /= 10) {
            if (x % 10 == d) {
                sum++;
            }
        }
        return sum;
    }

    //Task5
    public static void revers(int x) {
        int k = 0;
        while (x > 0) {
            if (x % 10 == 0 && k == 0) {
                x /= 10;
                continue;
            }
            System.out.print(x % 10);
            x /= 10;
            k++;
        }
    }

    //Task6
    public static void smallestNaturalDivisor(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    //Task7
    public static void allNaturalDivisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task8
    public static int countNumber(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum++;
            }
        }
        return sum;
    }

    //Task9
    public static void sumOfTen() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Input number " + i);
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Your number sum is " + sum);
    }

    //Task10
    public static void binCalc(int bin) {
        int sum = 0;
        for (int i = 0; bin > 0; i++) {
            sum += Math.pow(2, i) * (bin % 10);
            bin /= 10;
        }
        System.out.println("Your binary number in digital is " + sum);
    }

    //Task11
    public static void posNegZero(int n) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int inp;
        for (int i = 0; i < n; i++) {
            inp = scanner.nextInt();
            if (inp > 0) {
                pos++;
            } else if (inp == 0) {
                zer++;
            } else {
                neg++;
            }
        }
        System.out.println("number of zeros " + zer + " number of positive " + pos + " negative numbers " + neg);
    }

    //Task12
    public static void gnche(int n) {
        int sum = 0;
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                sum++;
                if (sum == n) {
                    return;
                }
            }
        }
    }

    //Task13
    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Task14
    public static void checkerboard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    //Task15
    public static void matrix(int n) {
        System.out.print(" * |");
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            }
            if (i >= 10 && i < 100) {
                System.out.print("  " + i);
            }
            if (i >= 100 && i < 1000) {
                System.out.print("  " + i);
            }
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |");
            }
            if (i >= 10 && i < 100) {
                System.out.print(i + " |");
            }
            if (i >= 100 && i < 1000) {
                System.out.print(i + "|");
            }
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.print("   " + i * j);
                }
                if (i * j >= 10 && i * j < 100) {
                    System.out.print("  " + i * j);
                }
                if (i * j >= 100 && i * j < 1000) {
                    System.out.print(" " + i * j);
                }
            }
            System.out.println();
        }

    }

    //Task16
    public static void trianglA(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trianglB(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j + i < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trianglC(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void trianglD(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
//        System.out.println("Input a");
//        int a = scanner.nextInt();
//        System.out.println("Input b");
//        int b = scanner.nextInt();
//        allEven(a,b);
        //Task 2
//        System.out.println("Input a");
//        int a = scanner.nextInt();
//        System.out.println("Input b");
//        int b = scanner.nextInt();
//        System.out.println("Input c");
//        int c = scanner.nextInt();
//        System.out.println("Input d");
//        int d = scanner.nextInt();
//        divided(a,b,c,d);
        //Task 3
//        System.out.println("Input a");
//        int a =scanner.nextInt();
//        System.out.println("Input b");
//        int b =scanner.nextInt();
//        squares(a,b);
        //Task 4
//        System.out.println("Input x number");
//        int x=scanner.nextInt();
//        System.out.println("Input d 0-9");
//        int d=scanner.nextInt();
//        System.out.println(digitNum(x,d));
        //Task 5
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        revers(x);
        //Task 6
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        smallestNaturalDivisor(x);
        //Task 7
//        System.out.println("Input x");
//        int x= scanner.nextInt();
//        allNaturalDivisors(x);
        //Task 8
//        System.out.println("Input x");
//        int x = scanner.nextInt();
//        System.out.println(countNumber(x));
        //Task 9
//        sumOfTen();
        //Task 10
//        System.out.println("Input binary number");
//        int bin = scanner.nextInt();
//        binCalc(bin);

        //Task 11
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        posNegZero(n);
        //Task 12
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        gnche(n);
        //Task13
//        System.out.println("input number");
//        int n=scanner.nextInt();
//        square(n);
        //Task14
//        System.out.println("Input number");
//        int n = scanner.nextInt();
//        checkerboard(n);
        //Task 15
//        System.out.println("Input size");
//        int n= scanner.nextInt();
//        matrix(n);
        //Task 16
//        System.out.println("Input number");
//        int n = scanner.nextInt();
//        System.out.println("Input Variant a,b,c or d");
//        char variant = scanner.next().charAt(0);
//        switch (variant) {
//            case 'a':
//                trianglA(n);
//                break;
//            case 'b':
//                trianglB(n);
//                break;
//            case 'c':
//                trianglC(n);
//                break;
//            case 'd':
//                trianglD(n);
//                break;
//            default:
//                System.out.println("error");
//                break;
//
//        }


    }
}
