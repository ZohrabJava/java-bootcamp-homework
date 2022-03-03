package com.aca.day18;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private String[] product;

    public Store(int countOfWorkers, String name, int phoneNumber, String[] product) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.product = product;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }
    private void printProduct(String[] product){
        for (String s : product) {
            System.out.print(s + " ");
        }
    }
    public void display(){
        System.out.print("Count of worker is "+getCountOfWorkers()+
                ", Name is "+getName()+", Phone number is "+getPhoneNumber()+", Product is ");
        printProduct(getProduct());
    }

}
