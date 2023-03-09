package com.youjia.web.controller.JUC.lock;


/**
 * @author youjia
 * @version 1.0
 * @description 不可重入锁
 * @className UnReetrant
 * @date 2022/10/26 15:30
 */
public class UnReentrant {

        Lock lock = new Lock();

        public void method1() throws InterruptedException {
            lock.lock();
            System.out.println("method1加锁");
            method2();
            lock.unlock();
        }

        public void method2() throws InterruptedException {
            lock.lock();
            System.out.println("method2加锁");
            lock.unlock();
        }


        static class Lock {
            private boolean isLocked = false;
            public synchronized void lock() throws InterruptedException{
                //判断当前对象是否加锁
                while(isLocked){
                    //加锁等待
                    wait();
                }
                isLocked = true;
            }
            public synchronized void unlock(){
                isLocked = false;
                //释放当前对象的锁 唤醒任意一个 等待的线程
                notify();
            }
        }

    public static void main(String[] args) throws InterruptedException {

        UnReentrant unReentrant = new UnReentrant();

        unReentrant.method1();

    }

}
