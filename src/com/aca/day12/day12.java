package com.aca.day12;

import java.util.Random;
import java.util.Scanner;

public class day12 {
    public static int[] randArrPrint(int size, int origin, int bound) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(origin, bound);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static int[] inputArr(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //Task1
    public static void evenIndexArray(int size) {
        int[] arr = randArrPrint(size, 1, 100);
        System.out.println();
        for (int i = 0; i < size; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task2
    public static void evenElementArray(int size) {
        int[] arr = randArrPrint(size, 1, 100);
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task3
    public static void positiveElementArray(int size) {
        int[] arr = randArrPrint(size, -50, 50);
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task4
    public static void largerPrevious(int size) {
        int[] arr = randArrPrint(size, -50, 50);
        System.out.println();
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    //Task5
    public static void adjacent(int size) {
        int[] arr = randArrPrint(size, -50, 50);
        System.out.println();
        for (int i = 1; i < size; i++) {
            if (arr[i] > 0 && arr[i - 1] > 0) {
                System.out.println(arr[i - 1] + " " + arr[i]);
                break;
            }
            if (arr[i] < 0 && arr[i - 1] < 0) {
                System.out.println(arr[i - 1] + " " + arr[i]);
                break;
            }
        }
    }

    //Task6
    public static void maxElementIndex(int size) {
        int[] arr = randArrPrint(size, -50, 50);
        System.out.println();
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The largest is " + max + " index is " + index);
    }

    //Task7
    public static void smallPositive(int size) {
        int[] arr = randArrPrint(size, -50, 50);
        System.out.println();
        int min = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                min = arr[i];
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0 && min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    //Task8
    public static void differentElements(int size) {
        int sum = 1;
        int[] arr = inputArr(size);
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    //Task9
    public static void reversArrayPrint(int size) {
        int[] arr = inputArr(size);
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //Task10
    public static void reversArray(int size) {
        int[] arr = inputArr(size);
        for (int i = 0; i < size - i; i++) {
            int a = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = a;
        }
        printArray(arr);
    }

    //Task11
    public static void reversCentre(int size) {
        int[] arr = inputArr(size);
        for (int i = 1; i < size; i += 2) {
            int a = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = a;
        }
        printArray(arr);
    }

    //Task12
    public static void lastGoFirst(int size) {
        int[] arr = inputArr(size);
        int a = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
        printArray(arr);
    }

    //Task13
    public static void swapMinMax(int size) {
        int[] arr = inputArr(size);
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int c = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = c;
        printArray(arr);
    }

    //Task14
    public static void removeIndex(int size, int index) {
        int[] arr = inputArr(size);
        if(index>=0 && index<arr.length){
            for (int i = 0; i < size - 1; i++) {
                if(i>=index){
                    arr[i]=arr[i+1];
                }
                System.out.print(arr[i] + " ");
            }
        }else{
            printArray(arr);
        }

    }

    //Task15
    public static void onlyOnce(int size) {
        int[] arr = inputArr(size);
        for (int i = 0; i < size; i++) {
            boolean print = true;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    print = false;
                    break;
                }
            }
            if (print) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Task16
    public static void zeroToLeft(int size) {
        int[] arr = inputArr(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] == 0 && arr[j] != 0 && j > i) {
                    int c = arr[j];
                    arr[j] = arr[i];
                    arr[i] = c;
                    break;
                }
            }
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Task 1
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        evenIndexArray(size);
        //Task 2
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        evenElementArray(size);
        //Task 3
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        positiveElementArray(size);
        //Task 4
//        System.out.println("Input size");
//        int size = scanner.nextInt();
//        largerPrevious(size);
        //Task 5
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        adjacent(size);
        //Task 6
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        maxElementIndex(size);
        //Task 7
//        System.out.println("Input size");
//        int size = scanner.nextInt();
//        smallPositive(size);
        //Task 8
//        System.out.println("Input size");
//        int size= scanner.nextInt();
//        differentElements(size);
        //Task 9
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        reversArrayPrint(size);
        //Task 10
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        reversArray(size);
        //Task 11
//        System.out.println("input size");
//        int size = scanner.nextInt();
//        reversCentre(size);
        //Task 12
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        lastGoFirst(size);
        //Task13
//        System.out.println("input size");
//        int size = scanner.nextInt();
//        swapMinMax(size);
        //Task 14
//        System.out.println("input size");
//        int size = scanner.nextInt();
//        System.out.println("input index");
//        int index = scanner.nextInt();
//        removeIndex(size,index);
        //Task 15
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        onlyOnce(size);
        //Task 16
//        System.out.println("input size");
//        int size = scanner.nextInt();
//        zeroToLeft(size);
    }
}
