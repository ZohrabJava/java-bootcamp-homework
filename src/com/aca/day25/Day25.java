package com.aca.day25;

import java.util.Random;
import java.util.Scanner;

public class Day25 {
    //Task1
    public static int sumArr(int[] arr,int size){
        if(size==0){
            return arr[size];
        }
        return arr[size]+sumArr(arr,size-1);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    //Task2
    public static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-2)+fib(n-1);
    }
    //Task3
    public static int capsul(int n){
        if(n==0){
            return 0;
        }
        return n+capsul(n-1);
    }
    //Task4
    public static int sumi(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumi(n/10);
    }
    //Task5
    public static int search(int n){
        if(n==0){
            return 0;
        }
        if(n%10==7){
            return 1+search(n/10);
        }
        return  search(n/10);
    }
    //Task6
    public static int searchX(String str,int size){
        if(size<0){
            return 0;
        }
        if(str.charAt(size)=='x'){
            return 1+searchX(str,size-1);
        }
        return searchX(str,size-1);
    }
    //Task7
    public static String deleteX(String str,int size){
        if(size==str.length()){
            return "";
        }
        if(str.charAt(size)!='x'){
            return str.substring(size,size+1)+deleteX(str,size+1);
        }
        return deleteX(str,size+1);
    }
    //Task8
    public static String revers(String str,int size){
        if(size<0){
            return "";
        }
        return str.charAt(size)+revers(str,size-1);
    }
    //Task9
    public static String endX(String str,int size){
        if(size==str.length()){
            return"";
        }
        if (str.charAt(size)!='x'){
            return str.charAt(size)+endX(str,size+1);
        }
        return  endX(str,size+1)+str.charAt(size);
    }
    //Task10
    public static String  stringClean(String str,int start){
        if(start==str.length()-1){
            return str.charAt(start)+"";
        }
        if (str.charAt(start)!=str.charAt(start+1)){
            return str.charAt(start)+stringClean(str,start+1);
        }
        return stringClean(str,start+1);
    }
    //Task11
    public static String prime(int n,int k){
        if(k==1){
            return "Number is prime";
        }
        if(n%k!=0){
            return prime(n,k-1);
        }
        return "Number is not prime";
    }
    //Task12
    public static char maxDigit(String str,int length,char max){
        if (length==str.length()){
            return max;
        }
        if(str.charAt(length)>max){
            max=str.charAt(length);
        }
        return maxDigit(str,length+1,max);
    }
    //Task13
    public static String strNum(String str,int length){
        if (length==str.length()){
            return "";
        }
        if(str.charAt(length)>='0'&& str.charAt(length)<='9'){
            return str.charAt(length)+strNum(str,length+1);
        }
        return strNum(str,length+1);
    }
    //Task14
    public static String asterisk(String str,int length){
        if(length==str.length()-1){
            return str.charAt(length)+"";
        }
        return str.charAt(length)+"*"+asterisk(str,length+1);
    }
    //Task15
    public static String parentheses1(String str,int length){
        if(length==str.length()-1){
            return str.charAt(length)+"";
        }
        if(length<str.length()/2){
            return str.charAt(length)+"("+parentheses1(str,length+1);
        }
        return str.charAt(length)+")"+parentheses1(str,length+1);
    }
    //Task16
    public static String parentheses2(String str,int length){
        if(length==str.length()){
            return str;
        }
        if(str.charAt(length)=='(') {
            return parentheses2(str,length+1)+")";
        }
        return parentheses2(str,length+1)+ str.charAt(length);
    }
    //Task17
    public static String cut(String str, int length) {
        if (length == str.length() / 2 && length % 2 != 0) {
            return str.charAt(length) + "";
        }
        if (length == str.length() / 2) {
            return "";
        }

        if (str.charAt(length) == str.charAt(str.length() - length - 1)) {

            return cut(str, length + 1);
        }
        return str.charAt(length) + cut(str, length + 1) + str.charAt(str.length() - length - 1);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        //Task1
//        System.out.println("Input size of array");
//        int size =scanner.nextInt();
//        int[]arr=new int[size];
//        System.out.println("Input natural n for search factorial");
//        int n=scanner.nextInt();
//        for (int i = 0; i < size; i++) {
//            arr[i]=random.nextInt(50);
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Sum of array is "+sumArr(arr,size-1));
//        System.out.println("Factorial is n "+factorial(n));
        //Task2
//        System.out.println("Input n");
//        int n=scanner.nextInt();
//        System.out.println(fib(n));
        //Task3
//        System.out.println("input n");
//        int n=scanner.nextInt();
//        System.out.println(capsul(n));
        //Task4
//        System.out.println("Input n");
//        int n=scanner.nextInt();
//        System.out.println(sumi(n));
        //Task5
//        System.out.println("Input number");
//        int n=scanner.nextInt();
//        System.out.println(search(n));
        //Task6
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(searchX(str, str.length()-1));
        //Task7
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(deleteX(str, 0));
        //Task8
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(revers(str, str.length()-1));
        //Task9
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(endX(str, 0));
        //Task10
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(stringClean(str,0));
        //Task11
//        System.out.println("input number");
//        int n= scanner.nextInt();
//        System.out.println(prime(n,n-1));
        //Task12
//        System.out.println("Input digits");
//        String str=scanner.nextLine();
//        System.out.println(maxDigit(str,0,str.charAt(0)));
        //Task13
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(strNum(str,0));
        //Task14
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(asterisk(str,0));
        //Task15
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(parentheses1(str,0));
        //Task16
//        System.out.println("Input str");
//        String str=scanner.nextLine();
//        System.out.println(parentheses2(str,0));
        //Task17
//        System.out.println("Input str");
//        String str = scanner.nextLine();
//        System.out.println(cut(str, 0));
    }
}
