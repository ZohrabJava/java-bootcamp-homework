package com.aca.day24;

import java.util.HashSet;
import java.util.Set;

public class task {
    //Task1
    public static boolean duplicat(int[] arr){
        Set<Integer> dubl=new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(!(dubl.add(arr[i]))){
                return  true;
            }
        }
        return false;
    }
    //Task2
    public static void printNoDubli(int[] arr){
        Set<Integer> dubl=new HashSet<Integer>();
        for (int j : arr) {
            dubl.add(j);
        }
        int count;
        for (int k : arr) {
            count = 0;
            for (int i : arr) {
                if (dubl.contains(i) && k == i) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(k + " ");
            }
        }
        System.out.println();
    }
    //Task3
    public static int dublicatChar(String str){
        int count=0;
        Set<Character> dubl=new HashSet<Character>();
        for (int i = 0; i <str.length() ; i++) {
            if (!(dubl.add(str.charAt(i)))){
                count++;
            }
        }
        return count;
    }
    //Task4
    public static char firstChar(String str){
        boolean flag=true;
        Set<Character> dubl=new HashSet<Character>();
        for (int i = 0; i <str.length() ; i++) {
            dubl.add(str.charAt(i));
        }
        int count;
        for (int i = 0; i <str.length() ; i++) {
            count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(dubl.contains(str.charAt(j)) && str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return str.charAt(i);
            }
        }
        return '-';
    }
    //Task5
    public static int charakters(String str){
        Set<Character> dubl=new HashSet<Character>();
        for (int i = 0; i < str.length()   ; i++) {
            dubl.add(str.charAt(i));
        }
        return  dubl.size();
    }
    public static void main(String[] args) {
        //Task1
        int[] arr={1,2,3,3};
        System.out.println(duplicat(arr));
        //Task2
        int[] arr2={1,1,2,2,2,5,4};
        printNoDubli(arr2);
        //Task3
        String str="aaaaa";
        System.out.println(str+"->"+dublicatChar(str));
        //Task4
        String str2="llapa";
        System.out.println(str2+"->"+firstChar(str2));
        //Task5
        String str3="abcdaefjh";
        String str4="abba";
        System.out.println(str4+"->"+charakters(str4));
        System.out.println(str3+"->"+charakters(str3));

    }
}
