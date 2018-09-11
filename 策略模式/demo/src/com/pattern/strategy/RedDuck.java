package com.pattern.strategy;

import com.pattern.template.Fly;
import com.pattern.template.FlyByWing;

public class RedDuck extends  Duck {

    @Override
    protected void display() {
        System.out.println("我是红脖子的鸭子");
    }

    public RedDuck() {
       super.setFly(new FlyByWing());
    }
}
