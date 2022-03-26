package com.aca.test;

import java.util.*;

public class testClass <T extends Iterator>{


    public static void main(String[] args) {
        EnumMap<testEnam,Integer> enamIntegerEnumMap=new EnumMap<>(testEnam.class);
        enamIntegerEnumMap.put(testEnam.Ando,25);
        System.out.println();
        System.out.println();
        System.out.println(testEnam.Karen);
        System.out.println(enamIntegerEnumMap);
//        Hashtable<Integer,Integer> hashtable=new Hashtable<>();
//        hashtable.put(15,20);
//        hashtable.put(18,270);
//        hashtable.put(14,28);
//        hashtable.put(24,24);
//        HashSet<Integer> hashSet=new HashSet<>();
//        hashSet.add(15);
//        hashSet.add(18);
//        hashSet.add(14);
//        hashSet.add(24);
//        System.out.println(hashtable);
//        for (Integer k:hashtable.keySet()) {
//            System.out.println(hashtable.get(k).hashCode()+" "+hashtable.get(k));
//        }
//        System.out.println(hashSet);
//        for (Integer k:hashSet) {
//            System.out.println(hashSet.);
//        }
//        System.out.println(hashtable.hashCode());
    }
}
