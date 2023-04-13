package com.youjia.web.controller.algorithm.test;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className Thread1
 * @date 2023/4/7 16:37
 */
public class Thread1 {



    public static void main(String[] args) throws InterruptedException {
        Th Th = new Th();
        Thread t1 = new Thread(Th,"线程1");
        Thread t2 = new Thread(Th,"线程2");
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();

        System.out.println(Thread.currentThread().getName());
    }

    static class Th extends Thread {
        private int i = 0;
        @Override
        public void run() {
            while (true) {
                synchronized (this) {
                    notify();
                    if(i < 1000){
                        System.out.println(Thread.currentThread().getName()+"---"+ ++i);
                    }else{
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
