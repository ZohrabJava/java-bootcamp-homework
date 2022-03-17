package com.aca.test;

public class Car {

    private String model;
    private int year;
    private String color;

    public Car() {
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int hashCode() {
        int hash =1;
        hash = hash * 11 +year ;
        return hash;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean  equals(Object o){
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Car auto=(Car)o;
        return auto.year==this.year;
    }

    public static void main(String[] args) {
        Car honda=new Car("Honda",2015,"black");
        Car bmw=new Car("Bmw",2015,"black");
        System.out.println(honda.hashCode());
        System.out.println(bmw.equals(honda));
    }

}
