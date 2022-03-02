package com.aca.day19.task3;

public class TaxAccounting extends Accounting {
    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }
    public void account() {
        System.out.println("TaxAccounting");
    }


}
