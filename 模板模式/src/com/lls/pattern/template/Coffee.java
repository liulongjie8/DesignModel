package com.lls.pattern.template;

public class Coffee extends  RefreshBeverage {


    @Override
    protected void brew() {

        System.out.println("用沸水冲泡咖啡");

    }

    @Override
    protected void addCondiments() {

        System.out.println("加入糖和牛奶");

    }

    @Override
    protected boolean isCoustomerWantsCondiments() {
        return super.isCoustomerWantsCondiments();
    }
}
