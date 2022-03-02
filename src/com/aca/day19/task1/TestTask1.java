package com.aca.day19.task1;

public class TestTask1 {
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.voice();
        cat.eat();
        Animal doberman=new Dog();
        doberman.voice();
        doberman.eat();
        Dog pitbul=new Dog();
        pitbul.voice();
        pitbul.eat();
    }
}
