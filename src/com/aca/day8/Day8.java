package com.aca.day8;

import java.util.Random;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
        /*
        System.out.println("Input your age");
        int age= scanner.nextInt();
        if (age>=18) {
            System.out.println("You are  the right to vote.");
        }
        else {
            System.out.println("You have no right to vote.");
        }
         */
        //Task 2
        /*
        System.out.println("Input number");
        int num=scanner.nextInt();
        if (num%2==0){
            System.out.printf("Input number is an even number");
        }
        else{
            System.out.println("Input number is an odd number");
        }
         */
        //Task 3
        /*
        Random rand = new Random();
        System.out.println("Random number 2 to 7");
        int r=rand.nextInt(2,7);
        System.out.println(r);
         */
        //Task 4
        /*
        System.out.println("Input number");
        int num=scanner.nextInt();
        if (num%5==0){
            System.out.println("Number is a multiple of a 5");
        }
        else{
            System.out.println("Number is not a multiple of 5");
        }
         */
        //Task 5

//        System.out.println("Input number 1");
//        int n1=scanner.nextInt();
//        System.out.println("Input number 2");
//        int n2= scanner.nextInt();
//        System.out.println("Input number 3");
//        int n3= scanner.nextInt();
//        int max=n1;
//        if(max<n2){
//            max=n2;
//        }
//        if(max<n3){
//            max=n3;
//        }
//        System.out.println("Max number - "+max);

          //Task 6
//        System.out.println("Input number");
//        float num= scanner.nextFloat();
//        if(Math.abs(num)>0 && Math.abs(num)<1){
//            System.out.println("Small");
//        }
//        else if( Math.abs(num)>=1000000){
//            System.out.println("Large");
//        }
//        else if(num==0){
//            System.out.println("Zero");
//        }
//        else if(num>0){
//            System.out.println("Positive");
//        }
//        else {
//            System.out.println("Negative");
//        }
        //Task 7
//        System.out.println("Input number 1 to 7");
//        int day = scanner.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("error");
//                break;
//
//        }

        //Task 8
//        System.out.println("Input k");
//        int k=scanner.nextInt();
//        if (k==7 || k==1 || k==2 || k==4 ) {
//            System.out.println("You can not buy");
//        }
//        else {
//            System.out.println("You can  buy");
//        }

        //Task 9
//        System.out.println("Input Year");
//        int year=scanner.nextInt();
//        boolean leap=false;
//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    leap=true;
//                }
//            }
//            else{
//                leap=true;
//            }
//        }
//        if(leap){
//            System.out.println("Leap Year");
//        }
//        else{
//            System.out.println("Not Leap Year");
//        }

        //Task8
//        Random random=new Random();
//        int n=random.nextInt(-2000,2000);
//        System.out.println("Your number is "+n);
//        if((n>-1000 && n<1000)&&(n%3==0 ||n%5==0)){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }

        //Task9
//        System.out.println("Input a");
//        int a=scanner.nextInt();
//        System.out.println("Input b");
//        int b=scanner.nextInt();
//        System.out.println("a > 10 and b is not equal to 10");
//        if(a>10 && b!=10){
//            System.out.println("Both a and b legal");
//        }
//        else if(a>10 && b==10){
//            System.out.println("a is legal b is illegal");
//        }
//        else if(a<=10 && b!=10){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }
//        System.out.println("both a and b is positive");
//        if(a>0 && b>0){
//            System.out.println("Both a and b legal");
//        }
//        else if(a>0 && b<=0){
//            System.out.println("a is legal b is illegal");
//        }
//        else if (a<=0 && b>0 ){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }
//        System.out.println("both a and b is negative ");
//        if(a<0 && b<0){
//            System.out.println("Both a and b legal");
//        }
//        else if(a<0 && b>=0){
//            System.out.println("a is legal b is illegal");
//        }
//        else if (a>=0 && b<0){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }
//        System.out.println("a > 10 b < 1 both of them are odd");
//        if((a>10 && a%2==1) && (b<1 && b%2==1)){
//            System.out.println("Both a and b legal");
//        }
//        else if((a>10 && a%2==1) && (b>=1 || b%2==0)){
//            System.out.println("a is legal b is illegal");
//        }
//        else if((a<=10 || a%2==0) && (b<1 && b%2==1)){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }
//        System.out.println("a is a multiple of 5 OR b is a multiple of 5");
//        if(a%5==0 && b%5==0){
//            System.out.println("Both a and b legal");
//        }
//        else if(a%5==0 && b%5!=0){
//            System.out.println("a is legal b is illegal");
//        }
//        else if(a%5!=0 && b%5==0){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }
//        System.out.println("a is not a multiple of 5 but b is a multiple of 5");
//        if(a%5!=0 && b%5==0){
//            System.out.println("Both a and b legal");
//        }
//        else if(a%5!=0 && b%5!=0){
//            System.out.println("a is legal b is illegal");
//        }
//        else if(a%5==0 && b%5==0){
//            System.out.println("a is illegal b is legal");
//        }
//        else{
//            System.out.println("a is illegal b is illegal");
//        }

        //Task10
//        System.out.println("Input a");
//        int a=scanner.nextInt();
//        System.out.println("Input b");
//        int b=scanner.nextInt();
//        if ((a%7==0 || b%7==0)&&(a>0 &&b>0)&& a>b){
//            if(b%2==1) {
//                for (int i = b + 2; i < a; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//            else{
//                for (int i = b + 1; i < a; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//        else if(a>b){
//            if(b%2==0) {
//                for (int i = b + 2; i < a; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//            else{
//                for (int i = b + 1; i < a; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//        else{
//            if(a%2==0) {
//                for (int i = a + 2; i < b; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//            else{
//                for (int i = b + 1; i < a; i += 2) {
//                    System.out.print(i + " ");
//                }
//            }
//
//        }

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
//        if ((x1 > 0 && y1 > 0) && (x2 > 0 && y2 > 0) && (x3 > 0 && y3 > 0) &&(x4>0 && y4>0)){
//            System.out.println("Same quarter");
//        }
//        else if((x1 > 0 && y1 < 0) && (x2 > 0 && y2 < 0) && (x3 > 0 && y3 < 0) &&(x4>0 && y4<0)){
//            System.out.println("Same quarter");
//        }
//        else if((x1 < 0 && y1 > 0) && (x2 < 0 && y2 > 0) && (x3 < 0 && y3 > 0) &&(x4<0 && y4>0)){
//            System.out.println("Same quarter");
//        }
//        else if((x1 < 0 && y1 < 0) && (x2 < 0 && y2 < 0) && (x3 < 0 && y3 < 0) &&(x4<0 && y4<0)){
//            System.out.println("Same quarter");
//        }
//        else {
//            System.out.println("Not in the same quarter");
//        }

        //Task12
//        System.out.println("Input a");
//        int a=scanner.nextInt();
//        System.out.println("Input b");
//        int b=scanner.nextInt();
//        System.out.println("Input c");
//        int c=scanner.nextInt();
//        if(a+b<c || a+c<b || b+c<a){
//            System.out.println("Degenerate triangle");
//        }
//        else{
//            System.out.println("Non-degenerate triangle");
//        }

//        //Task13
//        System.out.println("Input a");
//        int a= scanner.nextInt();
//        System.out.println("Input b");
//        int b= scanner.nextInt();
//        System.out.println("Input c");
//        int c= scanner.nextInt();
//        if(a==b && a==c){
//            System.out.println("3");
//        }
//        else if(a==b || b==c || a==c){
//            System.out.println("2");
//        }
//        else{
//            System.out.println("0");
//        }

        //Task14
//        System.out.println("Input a");
//        int a= scanner.nextInt();
//        System.out.println("Input b");
//        int b= scanner.nextInt();
//        System.out.println("Input c");
//        int c= scanner.nextInt();
//        if(b*b-4*a*c>0){
//            System.out.println("x1="+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
//            System.out.println("x2="+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
//        }
//        else if(b*b-4*a*c==0){
//            System.out.println("x="+(-b/(2*a)));
//        }
//        else{
//            System.out.println("Can't be");
//        }

        //Task15
//        System.out.println("Input a");
//        int a= scanner.nextInt();
//        System.out.println("Input b");
//        int b= scanner.nextInt();
//        System.out.println("Input c");
//        int c= scanner.nextInt();
//        if (a<=b && a<=c && b<=c){
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//        }
//        else if(a<=b && a<=c && b>c){
//            System.out.println(a);
//            System.out.println(c);
//            System.out.println(b);
//        }
//        else if(b<=a && b<=c && a<=c){
//            System.out.println(b);
//            System.out.println(a);
//            System.out.println(c);
//        }
//        else if(b<=a && b<=c && a>c){
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(a);
//        }
//        else if(c<=a && c<=b && a<=b){
//            System.out.println(c);
//            System.out.println(a);
//            System.out.println(b);
//        }
//        else if(c<=a && c<=b && a>b){
//            System.out.println(c);
//            System.out.println(b);
//            System.out.println(a);
//        }


    }
}
