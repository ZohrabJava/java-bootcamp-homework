package com.aca.day24;

import com.sun.source.tree.IfTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class task {
    //Task1
    public static boolean duplicat(int[] arr) {
        Set<Integer> dubl = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!(dubl.add(arr[i]))) {
                return true;
            }
        }
        return false;
    }

    //Task2
//    public static void printNoDubli(int[] arr) {
//        Set<Integer> dubl = new HashSet<Integer>();
//        for (int j : arr) {
//            dubl.add(j);
//        }
//        int count;
//        for (int k : arr) {
//            count = 0;
//            for (int i : arr) {
//                if (dubl.contains(i) && k == i) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.print(k + " ");
//            }
//        }
//        System.out.println();
//    }
    public static void printNoDubli(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j)+1);
            } else {
                map.put(j, 1);
            }
        }
        for (Integer k: map.keySet()){
            if (map.get(k)==1){
                System.out.print(k+" ");
            }
        }
        System.out.println();
    }

    //Task3
//    public static int dublicatChar(String str) {
//        int count = 0;
//        Set<Character> dubl = new HashSet<Character>();
//        for (int i = 0; i < str.length(); i++) {
//            if (!(dubl.add(str.charAt(i)))) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int dublicatChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count=0;
        for (int j=0;j<str.length();j++) {
            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j))+1);
                count++;
            } else {
                map.put(str.charAt(j), 1);
            }
        }
        return count;
    }
    //Task4
//    public static char firstChar(String str) {
//        boolean flag = true;
//        Set<Character> dubl = new HashSet<Character>();
//        for (int i = 0; i < str.length(); i++) {
//            dubl.add(str.charAt(i));
//        }
//        int count;
//        for (int i = 0; i < str.length(); i++) {
//            count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (dubl.contains(str.charAt(j)) && str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return str.charAt(i);
//            }
//        }
//        return '-';
//    }
    public static char firstChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (int j=0;j<str.length();j++) {
            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j))+1);
            } else {
                map.put(str.charAt(j), 1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return '-';
    }
   // Task5
    public static int charakters(String str) {
        Map <Character,Integer>map=new HashMap<>();
        int max=0;
        int start=0;
        char ch;
        for (int j=0;j<str.length();j++) {
            ch= str.charAt(j);
            if (map.containsKey(ch)){
                start=Math.max(start,map.get(ch)+1);
            }
            map.put(ch, j);
            max=Math.max(max,j-start+1);
        }
       return max;
    }
//    public static int charakters(String str) {
//        Map <Character,Integer>map=new HashMap<>();
//        int max=0;
//        int start=0;
//        for (int j=0;j<str.length();j++) {
//            if(j-start>max){
//                max=j-start;
//            }
//            if (map.containsKey(str.charAt(j))){
//                start++;
//                j=start;
//                map.clear();
//            }
//            map.put(str.charAt(j), j);
//        }
//        return max;
//    }

    public static void main(String[] args) {
        //Task1
        int[] arr = {1, 2, 3, 3};
        System.out.println(duplicat(arr));
        //Task2
        int[] arr2 = {1, 1, 2, 2, 2, 5, 4};
        printNoDubli(arr2);
        //Task3
        String str = "aaahfgbvhb";
        System.out.println(str+"->"+dublicatChar(str));
        //Task4
        String str2 = "llapa";
        System.out.println(str2 + "->" + firstChar(str2));
        //Task5
        String str5="abba";
        String str3 = "abcdaefjh";
        String str4 = "aaabaafdghhvrasdfghh";
        System.out.println(str5 + "->" + charakters(str5));
        System.out.println(str4 + "->" + charakters(str4));
        System.out.println(str3 + "->" + charakters(str3));


    }
}
