package com.pattern.strategy;

import com.pattern.template.Fly;
import com.pattern.template.NotFly;

public class BlackDuck extends  Duck {

    @Override
    protected void display() {
        System.out.println("我是黑脖子的鸭子");
    }


    public BlackDuck() {
        super.setFly(new NotFly());
    }
}
