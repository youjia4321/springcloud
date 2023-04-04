package com.youjia.web.controller.algorithm.sort;

import java.util.Arrays;

/**
 * @author youjia
 * @version 1.0
 * @description 快速排序
 * @className QuickSort
 * @date 2023/3/14 15:05
 */
public class QuickSort {

    public static int[] quickSort(int[] arr, int start, int end) {
        if(start < end) {
            // 把数组中的首位数字作为基准数
            int started = arr[start];
            // 记录需要排序的下标
            int low = start;
            int high = end;

            // 循环找到比基准数大的数和比基准数小的数
            while(low < high) {
                // 右边的数字比基准数大
                while(low < high && arr[high] >= started) {
                    high--;
                }
                // 使用右边的数替换左边的数
                arr[low] = arr[high];
                // 左边的数字比基准数小
                while(low < high && arr[low] <= started) {
                    low++;
                }
                // 使用左边的数替换右边的数
                arr[high] = arr[low];
            }

            // 把标准值赋给下标重合的位置
            arr[low] = started;
            // 处理所有小的数字
            quickSort(arr, start, low);
            // 处理所有大的数字
            quickSort(arr, low + 1, end);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,4,2,5,8,9,10,2,3};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length-1)));
    }

}
