package com.aca.day13;

import java.util.Scanner;

public class Day13 {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inputArray(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void inputArray(int[][] arr, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    //Task1
    public static void diagonalOne(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        printArray(arr);
    }

    //Task2
    public static void diagonalToo(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    arr[i][j] = 1;
                } else if (i + j < n) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 2;
                }
            }
        }
        printArray(arr);
    }

    //Task3
    public static void symmetrical(int n) {
        int[][] arr = new int[n][n];
        inputArray(arr);
        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //Task4
    public static void maxLine(int n, int m) {
        int[][] arr = new int[n][m];
        inputArray(arr, n, m);
        int sum = 0;
        int maxSum = 0;
        int sumIndex = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                sumIndex = i;
            }
        }
        System.out.println("Max is " + maxSum + " Line is " + sumIndex);
    }

    //Task5
    public static void maxArray(int n, int m) {
        int[][] arr = new int[n][m];
        inputArray(arr, n, m);
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Max is " + max + " row is " + maxI + " colum is " + maxJ);
    }

    //Task6
    public static void athletesArray(int n, int m) {
        int[][] arr = new int[n][m];
        inputArray(arr, n, m);
        int max = 0;
        int maxI = 0;
        int sum = 0;
        int realMax = 0;
        int realSum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            if (realMax < max || (realMax == max && sum > realSum)) {
                realMax = max;
                realSum = sum;
                maxI = i;
            }
        }
        System.out.println("Max is " + realMax + " row is " + maxI);
    }

    //Task8
    public static void sumTooArray(int n) {
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        System.out.println("Input arr1");
        inputArray(arr1);
        System.out.println("Input arr2");
        inputArray(arr2);
        System.out.println("Result");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task9
    public static void spiralOneZero(int n) {
        int[][] arr = new int[n][n];
        int i = 0;
        for (int l = 0; l <= n; l += 2) {

            for (int j = l; j < n - l; j++) {
                if (l == 0) {
                    arr[l][j] = 1;
                } else {
                    arr[l][j] = 1;
                    arr[l][j - 1] = 1;
                }
            }
            i = l;
            for (int j = n - l - 1; i < n - l - 1; i++) {
                arr[i][j] = 1;
            }
            for (int j = i; j > l; j--) {
                arr[i][j] = 1;
            }
            for (int j = l; i > 1 + l; i--) {
                arr[i][j] = 1;
            }
        }
        printArray(arr);

    }
    //Task10
    public static void spiralNum(int size){
        int n = size * 2 + 1;
        int[][] arr = new int[n][n];
        int k = 0;
        int i = 0;
        for (int l = 0; l < size; l++) {
            for (int j = l; j < n - l; j++) {
                arr[l][j] = k;
                k++;
            }
            i++;
            for (int j = n - l - 1; i < n - l - 1; i++) {
                arr[i][j] = k;
                k++;
            }
            for (int j = n - l - 1; j >= 0 + l; j--) {
                arr[i][j] = k;
                k++;
            }
            i--;
            for (int j = l; i > l; i--) {
                arr[i][j] = k;
                k++;
            }

        }
        arr[size][size] = k;
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1
//        System.out.println("Input size");
//        int n=scanner.nextInt();
//        diagonalOne(n);
        //Task 2
//        System.out.println("Input size");
//        int n = scanner.nextInt();
//        diagonalToo(n);
        //Task 3
//        System.out.println("Input size");
//        int n = scanner.nextInt();
//        symmetrical(n);
        //Task 4
//        System.out.println("Input n");
//        int n= scanner.nextInt();;
//        System.out.println("Input m");
//        int m= scanner.nextInt();
//        maxLine(n,m);
        //Task 5
//        System.out.println("Input n");
//        int n = scanner.nextInt();
//        System.out.println("Input m");
//        int m = scanner.nextInt();
//        maxArray(n,m);
        //Task 6
//        System.out.println("Input n");
//        int n = scanner.nextInt();
//        System.out.println("Input m");
//        int m = scanner.nextInt();
//        athletesArray(n,m);
        //Task 8
//        System.out.println("Input size");
//        int n = scanner.nextInt();
//        sumTooArray(n);
        //Task 9
//        System.out.println("Input N");
//        int n = scanner.nextInt();
//        spiralOneZero(n);
        //Task10
//        System.out.println("Input N");
//        int size = scanner.nextInt();
//        spiralNum(size);
    }
}
