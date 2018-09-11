package com.singleton.lls;

/**
 * 单例模式：
 *
 * 应用场景： 有些对象只需要一个  比如： 线程池  日至对象 缓存  配置文件 等
 *
 * 类型： 懒汉模式 、 饿汉模式
 *
 * 此 方式为 饿汉模式， 在初始化类对象的时候，这个类的实例就已经被创建了
 *
 */
public class Singleton {


    // 1 构造方法私有化
    private Singleton(){

    }

    // 2 创建类的唯一实例
    private static  Singleton instance = new Singleton();


    // 3 提供一个用于获取实例的方法
    public static Singleton getInstance(){
        return  instance;
    }


}
