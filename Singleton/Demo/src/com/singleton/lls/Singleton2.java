package com.singleton.lls;

/**
 * 懒汉模式
 *
 * 类加载的时候，此时并没有创建instance实例
 */
public class Singleton2 {

    //构造方法私有化
    private Singleton2(){

    }
    //定义类的实例
    private static Singleton2 instance;

    //提供获取类实例的方法
    public static Singleton2 getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return  instance;
    }


}
