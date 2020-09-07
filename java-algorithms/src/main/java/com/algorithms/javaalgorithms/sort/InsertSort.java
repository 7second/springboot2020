package com.algorithms.javaalgorithms.sort;

import java.util.Arrays;

/**
 * @author yupanpan
 * @date 2020/9/6 22:50
 * @desc 插入排序  时间复杂度 n²
 * @url https://www.runoob.com/w3cnote/insertion-sort.html
 */
public class InsertSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            //记录要插入的数据
            int tmp = arr[i];
            //从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }
            
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] sourceArray = {3,4,5,6,87,39,23,85,4,23,0,45,13,2,53,6};
        IArraySort  sort = new InsertSort();
        int[] res = sort.sort(sourceArray);
        System.out.println(Arrays.toString(res));
    }
}
