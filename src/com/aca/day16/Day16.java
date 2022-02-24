package com.aca.day16;

import java.util.Locale;
import java.util.Scanner;

public class Day16 {
    //Task3
    public static int power(int n) {
        if (n < 1 || n > 15) {
            return -1;
        }
        int pow = 1;
        while (n > 0) {
            pow <<= 1;
            n--;
        }
        return pow;
    }

    //Task 4
    public static void minute(int n) {
        System.out.println((n / 60) % 24 + " " + n % 60);
    }

    //Task5
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Task6
    public static void polindrom(int a, int b) {
        if (a < 1000 || a > 9999) {
            System.out.println("Wrong input");
        } else {
            for (; a < b; a++) {
                if (a % 10 == (a / 1000) % 10 && (a / 10) % 10 == (a / 100) % 10) {
                    System.out.println(a);
                }
            }
        }

    }

    //Task7
    public static String uperCaseFirst(String str) {
        String str2 = str.toLowerCase().substring(1);
        String str1 = str.toUpperCase().substring(0, 1);
        return str1 + str2;
    }

    //Task8
    public static char[][] builderChar(int n) {
        char[][] xo = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    xo[i][j] = '0';
                } else {
                    xo[i][j] = 'X';
                }
            }
        }
        return xo;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    //Task9
    public static double progres(double start, double step, int end) {
        for (int i = 0; i < end - 1; i++) {
            start *= step;
        }
        return start;
    }

    //Task10
    public static void primeMul(int n) {
        StringBuilder line = new StringBuilder();
        if (prime(n)) {
            System.out.println(n);
        } else {
            for (int i = n - 1; i > 0; i--) {
                while (n % i == 0 && prime(i) && n != 1) {
                    n /= i;
                    line.append(i).append("*");
                }
            }
            System.out.println(line.reverse().delete(0, 1));
        }
    }

    //Task11
    public static int[][] multiplicationTable(int n, int m) {
        int[][] table = new int[n][m];
        int row;
        int col;
        for (int i = m; i < n * m; i++) {
            row = i / m;
            col = i % m;
            table[row][col] = row * col;
        }

        return table;
    }

    //Task12
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] arrayFill(int[][] arr) {
        int count = 1;
        int row = 0;
        int colum = 1;
        int end = 1;
        for (int i = 0; i < arr.length * arr[0].length; i++) {
            arr[row][colum] = count;
            count++;
            if (row == arr.length - 1 && colum == arr[0].length - 1) {
                break;
            }
            if (colum == 0 && row != arr.length - 1) {
                if (row + colum + 1 > arr[0].length - 1) {
                    colum = arr[0].length - 1;
                    row = end;
                    end++;
                    continue;
                }
                colum = row + 1;
                row = 0;
                continue;
            }
            if (row == arr.length - 1) {
                if (row + colum + 1 > arr[0].length - 1) {
                    colum = arr[0].length - 1;
                    row = end;
                    end++;
                    continue;
                }
                colum += row + 1;
                row = 0;
                continue;
            }
            row++;
            colum--;
        }
        return arr;
    }

    //Task13
    public static int[][] arrayFill2(int[][] arr) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            do {
                if (i % 2 == 0) {
                    arr[i][j] = count;
                    j++;
                } else {
                    j--;
                    arr[i][j] = count;
                }
                count++;
            } while (j > 0 && j < arr[i].length);
        }
        return arr;
    }

    //Task14
//    public static int[][] transportingMatrix1(int[][] arr) {
//        int chenj;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; i + j < arr.length - 1; j++) {
//                chenj = arr[i][j];
//                arr[i][j]=arr[arr.length-1-j][i];
//                arr[arr.length-1-j][i]=chenj;
//                chenj = arr[i][j];
//                arr[i][j]=arr[arr.length-1-i][i];
//                arr[arr.length-1-j][i]=chenj;
//
//            }
//
//        }
//        return arr;
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task3
//        System.out.println("Input N");
//        int n= scanner.nextInt();
//        System.out.println(power(n));
        //Task4
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        minute(n);
        //Task5
//        System.out.println("Input n");
//        int n = scanner.nextInt();
//        System.out.println(prime(n));
        //Task6
//        System.out.println("Input four-digit numbers A");
//        int a= scanner.nextInt();
//        System.out.println("Input four-digit numbers B");
//        int b= scanner.nextInt();
//        polindrom(a,b);
        //Task7
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(uperCaseFirst(str));
        //Task8
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        char[][] matrix =new char[n][n];
//        matrix= builderChar(n);
//        printMatrix(matrix);
        //Task9
//        System.out.println("Input Start");
//        double start= scanner.nextDouble();
//        System.out.println("Input Step");
//        double step= scanner.nextDouble();
//        System.out.println("Input N");
//        int n= scanner.nextInt();
//        System.out.println(progres(start,step,n));
        //Task10
//        System.out.println("Input n");
//        int n = scanner.nextInt();
//        primeMul(n);
        //Task11
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        System.out.println("Input m");
//        int m= scanner.nextInt();
//        int[][] arr=multiplicationTable(n,m);
//        printArray(arr);
        //Task12
//        System.out.println("Input n");
//        int n = scanner.nextInt();
//        System.out.println("Input m");
//        int m = scanner.nextInt();
//        int[][] arr = new int[n][m];
//        arr = arrayFill(arr);
//        printArray(arr);
        //Task13
//        System.out.println("Input n");
//        int n= scanner.nextInt();
//        System.out.println("Input m");
//        int m=scanner.nextInt();
//        int[][] arr=new int[n][m];
//        arr=arrayFill2(arr);
//        printArray(arr);
        //Task14


    }
}
