package com.pattern.template;

public class NotFly implements  Fly {

    @Override
    public void fly() {
        System.out.println("我不能飞行");
    }


}
