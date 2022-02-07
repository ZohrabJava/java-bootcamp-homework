package com.aca.day5;

public class TestPerson {
    public static void main(String[] args) {
        Person user=new Person();
        Person admin=new Person("Ando",25,"Yerevan");
        user.print();
        admin.print();
    }
}
