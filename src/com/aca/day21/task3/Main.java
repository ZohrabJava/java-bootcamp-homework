package com.aca.day21.task3;

public class Main {
    public static void main(String[] args) {
        Animal fish=new Animal(10,"Ishxan");
        System.out.println("Age is "+fish.age+" Name is "+ fish.name);
        fish.sound();
        Cat katu=new Cat(3,"Garfild");
        System.out.println("Age is "+katu.age+" Name is "+ katu .name);
        katu.sound();
        Animal piso=new Cat(5,"Murka");
        System.out.println("Age is "+piso.age+" Name is "+ piso .name);
        piso.sound();
    }
}
