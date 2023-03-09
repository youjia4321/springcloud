package com.youjia.web.controller.JUC.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className Reentrant
 * @date 2022/10/26 15:29
 */
public class Reentrant {

    private ReentrantLock lock = new ReentrantLock();

    public void method1() {
        lock.lock();
        System.out.println("method1加锁");
        method2();
        lock.unlock();
    }

    public void method2() {
        lock.lock();
        System.out.println("method2加锁");
        lock.unlock();
    }

    public static void main(String[] args) {

        Reentrant reentrant = new Reentrant();

        reentrant.method1();

    }


}
