package com.youjia.web.controller.algorithm.sort;

import java.util.Arrays;

/**
 * @author youjia
 * @version 1.0
 * @description 冒泡排序  O(n^2)
 * @className BubbleSort
 * @date 2023/3/14 14:52
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

}
