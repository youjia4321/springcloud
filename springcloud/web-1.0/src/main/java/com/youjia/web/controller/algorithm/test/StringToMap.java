package com.youjia.web.controller.algorithm.test;

import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className StringToMap
 * @date 2023/4/11 15:40
 */
public class StringToMap {


    public static void main(String[] args) {


//        String abc = "1:a,2:b,3:c,4:d";
//        System.out.println(getStringToMap(abc));
//        System.out.println(removeDuplicate(new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8))));
        runDAfterABC();
        runABCWhenAllReady();
    }

    public static Map<String, String> getStringToMap(String str) {
        try {
            // 判断str是否有值
            if (null == str || "".equals(str)) {
                return null;
            }
            // 根据,截取
            String[] strings = str.split(",");
            // 设置HashMap长度
            int mapLength = strings.length;
            Map<String, String> map = new HashMap<>(mapLength);
            // 循环加入map集合
            for (String string : strings) {
                // 截取一组字符串
                String[] strArray = string.split(":");
                // strArray[0]为KEY strArray[1]为值
                map.put(strArray[0], strArray[1]);
            }
            return map;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<Integer> removeDuplicate(List<Integer> ls) {
        return ls.stream().distinct().collect(Collectors.toList());
    }

    private static void runDAfterABC() {
        int worker = 3;
        CountDownLatch countDownLatch = new CountDownLatch(worker);
        new Thread(() -> {
            System.out.println("D is waiting for other three threads");
            try {
                countDownLatch.await();
                System.out.println("All done, D starts working");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        for (char threadName='A'; threadName <= 'C'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(() -> {
                System.out.println(tN + " is working");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(tN + " finished");
                countDownLatch.countDown();
            }).start();
        }
    }


    private static void runABCWhenAllReady() {
        int runner = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
        final Random random = new Random();
        for (char runnerName='A'; runnerName <= 'C'; runnerName++) {
            final String rN = String.valueOf(runnerName);
            new Thread(() -> {
                long prepareTime = random.nextInt(10000) + 100;
                System.out.println(rN + " is preparing for time: " + prepareTime);
                try {
                    Thread.sleep(prepareTime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    System.out.println(rN + " is prepared, waiting for others");
                    cyclicBarrier.await(); // 当前运动员准备完毕，等待别人准备好
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(rN + " starts running"); // 所有运动员都准备好了，一起开始跑
            }).start();
        }
    }
}
