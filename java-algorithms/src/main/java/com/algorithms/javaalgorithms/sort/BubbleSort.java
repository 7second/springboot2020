package com.algorithms.javaalgorithms.sort;

import java.util.Arrays;

/**
 * @author yupanpan
 * @date 2020/9/7 22:33
 * @desc 冒泡排序 时间复杂度 n²
 * @url https://www.runoob.com/w3cnote/bubble-sort.html
 */
public class BubbleSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sourceArray = {3,4,5,6,87,39,23,85,4,23,0,45,13,2,53,6};
        IArraySort  sort = new BubbleSort();
        int[] res = sort.sort(sourceArray);
        System.out.println(Arrays.toString(res));
    }
}
