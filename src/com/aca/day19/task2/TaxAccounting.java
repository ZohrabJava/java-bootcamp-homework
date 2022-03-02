package com.aca.day19.task2;

public class TaxAccounting extends Accounting{
   private int countOfEmployers;
    private String departmentName ;
    public void account(){
        System.out.println("TaxAccounting");
    }

    public TaxAccounting( int countOfEmployers1, String departmentName1) {
        super(countOfEmployers1,departmentName1);
        this.countOfEmployers = countOfEmployers1;
        this.departmentName = departmentName1;
    }

    @Override
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
