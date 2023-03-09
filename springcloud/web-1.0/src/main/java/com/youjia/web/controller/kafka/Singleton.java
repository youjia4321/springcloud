package com.youjia.web.controller.kafka;

/**
 * @author youjia
 * @version 1.0
 * @description 单例模式
 * @className Singleton
 * @date 2023/3/3 9:56
 */
public class Singleton {

    public volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getSingleton();

        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1 == singleton2);

    }

}
