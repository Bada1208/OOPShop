package com.sysoiev.shop.Start;


import com.sysoiev.shop.client.CommonVisitor;
import com.sysoiev.shop.goods.Computer;
import com.sysoiev.shop.goods.Subwoofer;
import com.sysoiev.shop.goods.Televisor;
import com.sysoiev.shop.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Samsung");//only televisor


        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");
        //приведение
        GoodsInterface goodsInterface = new Televisor("Vesna");//any kind of good, but need to do downcasting in order to have televisor`s methods
        Televisor t = (Televisor) goodsInterface;
        t.selectChannel();//or in a such way:
        ((Televisor) goodsInterface).selectChannel();


        CommonVisitor commonVisitor = new CommonVisitor();
        commonVisitor.buy(goodsInterface);
        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);

    }
}
