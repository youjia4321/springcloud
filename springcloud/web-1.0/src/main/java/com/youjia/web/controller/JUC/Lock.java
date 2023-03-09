package com.youjia.web.controller.JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className Lock
 * @date 2023/3/3 10:26
 */
public class Lock {

    final ReentrantLock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Lock test = new Lock();
        Producer producer = test.new Producer();
        Consumer consumer1 = test.new Consumer();
        Consumer consumer2 = test.new Consumer();
        consumer1.start();
        consumer2.start();
        producer.start();
    }


    class Consumer extends Thread{

        @Override
        public void run() {
            consume();
        }

        private void consume() {
            try {
                lock.lock();
                System.out.println("我在等一个新信号"+currentThread().getName());
                condition.await();

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally{
                System.out.println("拿到一个信号"+currentThread().getName());
                lock.unlock();
            }

        }
    }

    class Producer extends Thread{
        @Override
        public void run() {
            produce();
        }

        private void produce() {
            try {
                lock.lock();
                System.out.println("我拿到锁"+ currentThread().getName());
                condition.signalAll();
                System.out.println("我发出了一个信号："+ currentThread().getName());
            } finally{
                lock.unlock();
            }
        }
    }

}
