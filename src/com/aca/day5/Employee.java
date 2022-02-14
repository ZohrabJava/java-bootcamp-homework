package com.aca.day5;

public class Employee {
    //fields id, name, department, age, gender
    int id;
    String name;
    String department;
    int age;
    char gender;

    public Employee() {
        this(10,"default","unknown",0,'m');
    }

    public Employee(int id, String name, String department, int age, char gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }
    public  void print(){
        System.out.println("Id-"+id);
        System.out.println("Name-"+name);
        System.out.println("Department-"+department);
        System.out.println("Age-"+age);
        System.out.println("Gender-"+gender);
    }
}
