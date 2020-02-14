package com.sysoiev.shop.client;

public class VipVisitor extends BaseVisitor {

    //private String name;не нужно дублировать переменную она у нас уже есть от BaseVisitor
    private float discount;

    @Override
    public void buy() {
        if(!checkDiscount()){
            super.buy();
        }else{
            //купить со скидкой
        }
    }
    private boolean checkDiscount(){
        return discount>0;
    }
}
