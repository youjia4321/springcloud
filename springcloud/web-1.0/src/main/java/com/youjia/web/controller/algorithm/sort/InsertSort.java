package com.youjia.web.controller.algorithm.sort;

import java.util.Arrays;

/**
 * @author youjia
 * @version 1.0
 * @description 插入排序
 * @className InsertSort
 * @date 2023/3/14 15:24
 */
public class InsertSort {

    public static int[] insertSort(int[] arr) {
        // 遍历所有数字
        for(int i = 1; i < arr.length; i++) {
            // 当前数字比前一个数字小
            if(arr[i] < arr[i - 1]) {
                int j;
                // 把当前遍历的数字保存起来
                int temp = arr[i];
                for(j = i - 1; j >= 0 && arr[j] > temp; j--) {
                    // 前一个数字赋给后一个数字
                    arr[j + 1] = arr[j];
                }
                // 把临时变量赋给不满足条件的后一个元素
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,4,2,5};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

}
