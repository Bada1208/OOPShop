package com.sysoiev.shop.Start;


import com.sysoiev.shop.client.CommonVisitor;
import com.sysoiev.shop.goods.Computer;
import com.sysoiev.shop.goods.Subwoofer;
import com.sysoiev.shop.goods.Televisor;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Samsung");

        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);

    }
}
