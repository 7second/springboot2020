package com.algorithms.javaalgorithms.sort;

import java.util.Arrays;

/**
 * @author yupanpan
 * @date 2020/9/6 22:36
 * @desc 选择排序
 */
public class SelectionSort implements IArraySort{

    @Override
    public int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        // 总共要经过n-1次比较
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            // 每轮需要比较次数n-i
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;

    }

}
