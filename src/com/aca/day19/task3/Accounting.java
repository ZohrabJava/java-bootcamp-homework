package com.aca.day19.task3;

public class Accounting extends ItCompany {

    @Override
    public void account() {
        System.out.println("Accounting");
    }

    public Accounting(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

}
