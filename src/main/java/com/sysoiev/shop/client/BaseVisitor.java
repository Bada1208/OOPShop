package com.sysoiev.shop.client;


import com.sysoiev.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(){

    }

    @Override
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }


}
