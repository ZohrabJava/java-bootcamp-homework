package com.aca.day19.task3;

public class SMM extends Marketing {
    public SMM(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    public void account() {
        System.out.println("SMM");
    }
}
