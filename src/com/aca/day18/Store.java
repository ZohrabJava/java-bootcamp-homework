package com.aca.day18;

public class Store {
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private String[] product;

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
            return;
        }
        System.out.println("Wrong count of Workers " + countOfWorkers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
            return;
        }
        System.out.println("Wrong name " + name);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber >= 10000000 && phoneNumber <= 99999999) {
            this.phoneNumber = phoneNumber;
            return;
        }
        System.out.println("Wrong phone number " + phoneNumber);
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }

    public Store(int countOfWorkers, String name, int phoneNumber, String[] product) {
        this.setCountOfWorkers(countOfWorkers);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setProduct(product);
    }

    public static void main(String[] args) {
        String[] product={"Gazar","Varung","Xncor","Tanc"};
        Store parma=new Store(17,"Gexam",12365478,product);

    }
}
