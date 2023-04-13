package com.youjia.web.controller.algorithm.test;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className Singleton
 * @date 2023/4/11 17:28
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    public static void main(String[] args) {

        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }
}