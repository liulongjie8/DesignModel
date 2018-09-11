package com.pattern.strategy;

import com.pattern.template.Fly;

public abstract class Duck {

    private Fly fly;

    private void quack(){
        System.out.println("噶噶噶噶");
    }

    protected  abstract  void display();


    private  void fly(){
        fly.fly();
    }


    protected  void setFly(Fly fly){
        this.fly =fly;
    }

}
