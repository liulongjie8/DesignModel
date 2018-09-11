package com.lls.pattern.template;


/**
 * 抽象积累，为所有子类提供一个算法框架
 */
public abstract class RefreshBeverage {


    /**
     * 制备饮料的模板方法
     * 封装了所有子类公共遵循的算法框架
     */
    public final void prepareBeverageTemplate(){

        // 1 将水煮沸
        boidWater();
        // 2 泡制饮料
        brew();
        // 3 导入杯中
        pourInCup();

        if(isCoustomerWantsCondiments()){
            // 4 添加
            addCondiments();
        }
     


    }

    /**
     * Hook 钩子函数 提供一个默认或者空的实现
     * 具体的子类可以自行决定是否挂钩 以及如何挂钩
     * 询问用户是否加入调料
     * @return
     */
    protected  boolean isCoustomerWantsCondiments(){
      return  true;
    }

    /**
     * 基本方法  将水煮沸
     * 不在子类中出现
     */
    private  void boidWater(){
        System.out.println("将水煮沸");
    };


    /**
     * 抽象方法 泡制饮料
     * 在子类中重写
     */
    protected  abstract  void brew();

    /**
     * 基本方法  将饮料导入杯中
     * 不在子类中出现
     */
    private void pourInCup(){
        System.out.println("饮料导入杯中");
    }

    /**
     * 抽象方法 添加调味料
     * 在子类中重写
     */
    protected  abstract  void addCondiments();
}
