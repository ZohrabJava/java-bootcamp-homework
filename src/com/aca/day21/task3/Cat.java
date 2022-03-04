package com.aca.day21.task3;

public class Cat extends Animal{
    protected int age;
    protected String name;

    public Cat(int age, String name) {
        super(age, name);
        this.age = age;
        this.name = name;
    }

    @Override
    protected void sound() {
        System.out.println("Cat sound");
    }
}
