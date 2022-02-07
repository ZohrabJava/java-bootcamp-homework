package com.aca.day5;

public class TestAuthor {
    public static void main(String[] args) {
        Author pushkin=new Author("Pushkin","pushkin@gmail.com",'m');
        pushkin.print();
        System.out.println("---------------------------------");
        Book ruslan=new Book("Ruslan",pushkin,50);
        Book car=new Book("Car",pushkin,40);
        ruslan.printAll();
        car.printAll();

    }
}
