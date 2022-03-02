package com.aca.day19.task3;

public class TestTask3 {
    public static void main(String[] args) {
        ItCompany accountOne=new ItCompany(10,"Albert");
        accountOne.account();
        ItCompany accountTwo=new Accounting(10,"Albert");
        accountTwo.account();
        ItCompany accountFour=new TaxAccounting(10,"Albert");
        accountFour.account();
        ItCompany accountFive=new FinancialAccount(10,"Albert");
        accountFive.account();
        ItCompany accountSix=new Marketing(10,"Albert");
        accountSix.account();
        ItCompany accountSeven=new SMM(10,"Albert");
        accountSeven.account();
        ItCompany accountEight=new SEO(10,"Albert");
        accountEight.account();
    }
}
