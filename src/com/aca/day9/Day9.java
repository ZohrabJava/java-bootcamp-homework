package com.aca.day9;

import java.util.Objects;
import java.util.Scanner;

public class Day9 {
    //Task1
    public static void equalsStr(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    //Task2
    public static void posNig(int n) {
        System.out.println("1)");
        if (n > 0) {
            System.out.println("n positive");
        } else {
            System.out.println("negative");
        }
        System.out.println("2)");
        if (n > 0) {
            System.out.println("positive");
        } else if (n == 0) {
            System.out.println("0");
        } else {
            System.out.println("negative");
        }

    }

    //Task3
    public static void tern(int a, int b) {
        System.out.println("Ternary Math.max(a,b)");
        System.out.println(a > b ? a : b);
        System.out.println("Ternary Math.abs(a)");
        System.out.println(a > 0 ? a : -a);
    }

    //Task4
    public static int ternary3(String str) {

        return Objects.equals(str, " ") ? -1 : (str == null ? 0 : 1);
    }

    //Task9
    public static void test(char inp) {
        switch (inp) {
            case 'b':
                System.out.println("Congratulation");
                break;
            default:
                System.out.println("Invalide choice");
                break;
        }
    }

    //Task10
    public static void word(char str) {
        switch (str) {
            case 65:
                System.out.println("Word is Wol");
                break;
            case 69:
                System.out.println("Word is Wol");
                break;
            case 73:
                System.out.println("Word is Wol");
                break;
            case 79:
                System.out.println("Word is Wol");
                break;
            case 85:
                System.out.println("Word is Wol");
                break;
            default:
                System.out.println("Word is Constreind");
        }
    }

    //Task10
    public static void number(int n) {
        switch (n) {
            case 0:
                System.out.println("Input number is " + n);
                break;
            case 1:
                System.out.println("Input number is " + n);
                break;
            case 2:
                System.out.println("Input number is " + n);
                break;
            case 3:
                System.out.println("Input number is " + n);
                break;
            case 4:
                System.out.println("Input number is " + n);
                break;
            case 5:
                System.out.println("Input number is " + n);
                break;
            case 6:
                System.out.println("Input number is " + n);
                break;
            case 7:
                System.out.println("Input number is " + n);
                break;
            case 8:
                System.out.println("Input number is " + n);
                break;
            case 9:
                System.out.println("Input number is " + n);
                break;
            default:
                System.out.println("Number is not 0 to 9");
        }
    }

    //Task11
    public static void evenOdd(int n) {
        n %= 2;
        switch (n) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
            default:
                System.out.println("Input error");
                break;
        }
    }

    //Task12
    public static void calc(double a, double b, char str) {

        switch (str) {
            case '+':
                System.out.println(a + "+" + b + ":" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + ":" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + ":" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + ":" + (a / b));
                break;
            default:
                System.out.println("error message to user");
                break;


        }
    }
    //Task13
    public static void day(int day){
        switch (day){
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
                System.out.println("Error variable");
                break;
        }
    }
    //Task14
    public static void scor(int a,int b,int c){
        int mij=((a+b+c)/3)/20;
        switch (mij){
            case 1:
                System.out.println("Your grade is F.");
                break;
            case 2:
                System.out.println("Your grade is C.");
                break;
            case 3:
                System.out.println("Your grade is B.");
                break;
            case 4:
                System.out.println("Your grade is A.");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
//        String str1="aba";
//        String str2=str1;
//        equalsStr(str1,str2);
//        str1= scanner.nextLine();
//        str2=scanner.nextLine();
//        equalsStr(str1,str2);
        //Task2
//        int n=scanner.nextInt();
//        posNig(n);
        //Task3
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        tern(a,b);
        //Task4
//        String str = scanner.nextLine();
//        System.out.println(ternary3(str));
        //Task 9
//        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
//        System.out.println(" a. int 1x=10;");
//        System.out.println(" b. int x=10;");
//        System.out.println(" c. float x=10.0f;");
//        System.out.println(" d. string x=\"10\";");
//        System.out.println(" Enter your choice:");
//        char inp=scanner.nextLine().charAt(0);
//        test(inp);
        //Task 10
//        System.out.println("Input word");
//        char str = scanner.nextLine().charAt(0);
//        word(str);
        //Task 10
//        System.out.println("Input number 0 to 9");
//        int n= scanner.nextInt();
//        number(n);
        //Task 11
//        System.out.println("Input number");
//        int n= scanner.nextInt();
//        evenOdd(n);
        //Task 12
//        System.out.println(" Enter first number:");
//        double a = scanner.nextDouble();
//        System.out.println("Enter second number:");
//        double b = scanner.nextDouble();
//        System.out.println("Enter an operator (+, -, *, /):");
//        char str = scanner.next().charAt(0);
//        calc(a, b, str);
        //Task 13
//        System.out.println("Input Week Day number");
//        int day=scanner.nextInt();
//        day(day);
        //Task 14
//        System.out.println("Quiz score:");
//        int a= scanner.nextInt();
//        System.out.println("Mid-term score:");
//        int b= scanner.nextInt();
//        System.out.println("Final score:");
//        int c=scanner.nextInt();
//        scor(a,b,c);

    }
}
