package com.aca.day19.task3;

public class Marketing extends ItCompany {
    public Marketing(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    public void account() {
        System.out.println("Marketing");
    }
}
