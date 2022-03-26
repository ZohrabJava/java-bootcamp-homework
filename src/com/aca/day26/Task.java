package com.aca.day26;

import java.util.*;

public class Task {
    //Task1
    public static <T> void print(List<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }
    //Task2
    public static <T> List<T> convert(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
    //Task3
    public static <T> T max(List<T> list, Comparator<T> comparator) {
        return Collections.max(list,comparator);
    }
    //Task4
    public static void  copy(List<Number> list1,List<? extends Number> list2){
        list1.clear();
        list1.addAll(list2);
    }
    public static void main(String[] args) {
        //Task1
        List<String> list=new ArrayList<>();
        list.add("Karen");
        list.add("Mixail");
        list.add("Seyran");
        print(list);
        //Task2
        String[] arr={"a","B"};
        List<String> list2=convert(arr);
        print(list2);
        //Task3
        List<String> li = new ArrayList<>();
        li.add("L");
        li.add("Bsa");
        li.add("Zcsacs");
        li.add("Gss");
        List<Integer> list1=new ArrayList<>();
        list1.add(15);
        list1.add(125);
        list1.add(25);
        Comparator<Integer> comparator2=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }
                return 0;
            }
        };
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o2.length() < o1.length()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        System.out.println(max(li, comparator));
        System.out.println(max(list1, comparator2));
        //Task4
        List<Number>lis =new ArrayList<>();
        List<Integer>lis2=new ArrayList<>();
        lis.add(15);
        lis.add(20);
        lis2.add(10);
        lis2.add(30);
        System.out.println(lis);
        System.out.println(lis2);
        copy(lis,lis2);
        System.out.println(lis);
        System.out.println(lis2);

    }
}
