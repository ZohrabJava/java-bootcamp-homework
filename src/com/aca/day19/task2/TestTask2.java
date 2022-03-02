package com.aca.day19.task2;

public class TestTask2 {
    public static void main(String[] args) {
        Accounting accountOne=new Accounting(10,"Albert");
        accountOne.account();
        Accounting accountTwo=new FinancialAccount(10,"Albert");
        accountTwo.account();
        Accounting accountFour=new TaxAccounting(10,"Albert");
        accountFour.account();
        FinancialAccount accountFive=new FinancialAccount(10,"Albert");
        accountFive.account();
        TaxAccounting accountSix=new TaxAccounting(10,"Albert");
        accountSix.account();
        TaxAccounting accountSeven=new FinancialAccount(10,"Albert");
        accountSeven.account();

    }
}
