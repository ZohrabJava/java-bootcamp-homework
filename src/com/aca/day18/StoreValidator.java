package com.aca.day18;

public class StoreValidator {
    public static boolean workersValidator(int worker){
        return worker >= 2 && worker <= 50;
    }
    public static boolean nameValidator(String name){
        return name.length() >= 3;
    }
    public static boolean phoneValidator(int phoneNumber ){
        return phoneNumber >= 10000000 && phoneNumber <= 99999999;
    }
}
