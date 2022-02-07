package com.aca.day5;

public class Book {
    String bookName;
    Author author;
    int price;

    public Book(String bookName, Author author, int price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    public void printAll(){
        printNameEmail();
        System.out.println("Gender Author-"+author.gender);
        System.out.println("Book Name-"+bookName);
        System.out.println("Price-"+price);
    }
    public void printNameEmail(){
        System.out.println("Author Name-"+author.name);
        System.out.println("Email-"+author.email);
    }
}
