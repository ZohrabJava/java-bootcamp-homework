package com.aca.day5;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void print(){
        System.out.println("Name-"+name);
        System.out.println("Email-"+email);
        System.out.println("Gender-"+gender);
    }
}
