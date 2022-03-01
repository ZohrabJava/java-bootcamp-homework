package com.aca.day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setAge(age);
        this.setGender(gender);
        this.setNationality(nationality);
    }

    public Person() {
        this.firstName = "Xcho";
        this.lastName = "Karapetyan";
        this.passportId = "AN025122";
        this.age = 20;
        this.gender = "Male";
        this.nationality = "Armenia";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void display() {
        System.out.println("First name is " + firstName + ",Last name is " + lastName + ",Passport id is " + passportId +
                ",Age is " + age + ",Gender is " + gender + ",Nationality is " + nationality);
    }

}
