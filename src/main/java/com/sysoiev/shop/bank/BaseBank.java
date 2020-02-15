package com.sysoiev.shop.bank;


import com.sysoiev.shop.interfaces.BankInterface;

public abstract class BaseBank implements BankInterface {

    private String name;
    private String creditDescription;

    public BaseBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }


    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
