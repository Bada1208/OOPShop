package com.sysoiev.anothershop.shop.service;


import com.sysoiev.anothershop.shop.enums.ConsultResult;
import com.sysoiev.anothershop.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;

    }


    public void send(){

    }


}
