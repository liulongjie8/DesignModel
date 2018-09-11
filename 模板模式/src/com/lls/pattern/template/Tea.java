package com.lls.pattern.template;

public class Tea extends  RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶五分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加柠檬");
    }

    @Override
    /**
     * @see RefreshBeverage#isCoustomerWantsCondiments()
     */
    protected boolean isCoustomerWantsCondiments() {
        return false;
    }
}
