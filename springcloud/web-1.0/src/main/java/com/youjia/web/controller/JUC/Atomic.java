package com.youjia.web.controller.JUC;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className Atomic
 * @date 2023/3/3 16:18
 */
public class Atomic {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        AtomicStampedReference<Integer> reference = new AtomicStampedReference<>(0, 1);


        T1 t1 = new T1(atomicInteger, reference);
        T2 t2 = new T2(atomicInteger, reference);
        t1.start();
        t2.start();
    }

    static class T1 extends Thread {
        private AtomicInteger atomicInteger;
        private AtomicStampedReference<Integer> atomicStampedReference;
        T1(AtomicInteger atomicInteger, AtomicStampedReference<Integer> atomicStampedReference){
            this.atomicInteger = atomicInteger;
            this.atomicStampedReference = atomicStampedReference;
        };

        @Override
        public void run() {
            // 修改
            this.atomicInteger.getAndAdd(1);
            // 修改回来
            this.atomicInteger.set(0);

            this.atomicStampedReference.set(1, this.atomicStampedReference.getStamp()+1);
            this.atomicStampedReference.set(0, this.atomicStampedReference.getStamp()+1);
        }
    }


    static class T2 extends Thread {
        private AtomicInteger atomicInteger;
        private AtomicStampedReference<Integer> atomicStampedReference;
        T2(AtomicInteger atomicInteger, AtomicStampedReference<Integer> atomicStampedReference){
            this.atomicInteger = atomicInteger;
            this.atomicStampedReference = atomicStampedReference;
        };

        @SneakyThrows
        @Override
        public void run() {
            Thread.sleep(1000);
            boolean rs = this.atomicInteger.compareAndSet(0, 2);
            System.out.println("修改是否成功：" + rs);

            System.out.println(this.atomicStampedReference.getStamp());
            boolean rs1 = this.atomicStampedReference.compareAndSet(0, 2, 3, 2);
            System.out.println("修改是否成功：" + rs1);
        }
    }

}
