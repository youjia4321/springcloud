package com.youjia.web.controller.algorithm.test;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className ABCD_Add_LOCK
 * @date 2023/4/11 17:10
 */
public class ABCD_Add_LOCK {

    private static int state = 0;
    private static int i = 0;
    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if(state % 4 == 0) {
                        System.out.print(i + " ");
                        state++;
                        i++;
                    }
                    if(state > 10) break;
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if(state % 4 == 1) {
                        System.out.print(i + " ");
                        state++;
                        i++;
                    }
                    if(state > 10) break;
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if(state % 4 == 2) {
                        System.out.print(i + " ");
                        state++;
                        i--;
                    }
                    if(state > 10) break;
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if(state % 4 == 3) {
                        System.out.print(i + " ");
                        state++;
                        i--;
                    }
                    if(state > 10) break;
                }
            }
        }).start();
    }

}
