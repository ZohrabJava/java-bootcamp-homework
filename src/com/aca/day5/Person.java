package com.aca.day5;

public class Person {
     String name;
     int age;
     String address;

    public Person() {
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void print(){
        System.out.println("Name-" + name);
        System.out.println("Age-"+age);
        System.out.println("Address-"+address);
    }
}
