package com.aca.day18;

import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task Person
        String firstName;
        String lastName;
        String passportId;
        int age;
        String gender;
        String nationality;
        System.out.println("Input first name");
        while (true) {
            firstName = scanner.nextLine();
            if (PersonValidator.testRangeName(firstName, 3, 15)) {
                break;
            }
            System.out.println("Wrong first Name " + firstName);
        }
        System.out.println("Input last name");
        while (true) {
            lastName = scanner.nextLine();
            if (PersonValidator.testRangeName(lastName, 6, 20)) {
                break;
            }
            System.out.println("Wrong last name " + lastName);
        }
        System.out.println("Input passport id");
        while (true) {
            passportId = scanner.nextLine();
            if (PersonValidator.passportIdValidator(passportId)) {
                break;
            }
            System.out.println("Wrong Passport Id " + passportId);
        }
        System.out.println("Input age");
        while (true) {
            age = scanner.nextInt();
            if (PersonValidator.ageValidator(age)) {
                break;
            }
            System.out.println("Wrong age " + age);
        }
        System.out.println("Input gander");
        gender = scanner.nextLine();
        while (true) {
            gender = scanner.nextLine();
            if (!PersonValidator.genderValidator(gender)) {
                System.out.println("Wrong gender " + gender);
                continue;
            }
            break;
        }
        System.out.println("Input nationality");
        nationality = scanner.nextLine();
        Person an = new Person(firstName, lastName, passportId, age, gender, nationality);
        an.display();
        //Task Triangle
        double a, b, c;
        do {
            System.out.println("Input side A");
            while (true) {
                a = scanner.nextDouble();
                if (TriangleValidator.rangeSide(a)) {
                    break;
                }
                System.out.println("Wrong side A " + a);
            }
            System.out.println("Input side B");
            while (true) {
                b = scanner.nextDouble();
                if (TriangleValidator.rangeSide(b)) {
                    break;
                }
                System.out.println("Wrong side B " + b);
            }
            System.out.println("Input side C");
            while (true) {
                c = scanner.nextDouble();
                if (TriangleValidator.rangeSide(c)) {
                    break;
                }
                System.out.println("Wrong side C " + c);
            }
            if (TriangleValidator.triangleValid(a, b, c)) {
                System.out.println("Wrong triangle " + a + " " + b + " " + c);
            }
        } while (TriangleValidator.triangleValid(a, b, c));
        Triangle right = new Triangle(a, b, c);
        right.check();
        //Task Store
        int countOfWorkers;
        String name;
        int phoneNumber;
        String[] product= {"Gazar", "Varung", "Xncor", "Tanc"};
        System.out.println("Input count of worker");
        while (true) {
            countOfWorkers= scanner.nextInt();
            if (StoreValidator.workersValidator(countOfWorkers)){
                break;
            }
            System.out.println("Wrong count of Workers " + countOfWorkers);
        }
        System.out.println("Input name");
        name= scanner.nextLine();
        while (true){
            name= scanner.nextLine();
            if(StoreValidator.nameValidator(name)){
                break;
            }
            System.out.println("Wrong name " + name);
        }
        System.out.println("Input phone number");
        while (true){
            phoneNumber= scanner.nextInt();
            if(StoreValidator.phoneValidator(phoneNumber)){
                break;
            }
            System.out.println("Wrong phone number " + phoneNumber);
        }
        Store parma = new Store(countOfWorkers, name, phoneNumber, product);
        parma.display();
    }
}
