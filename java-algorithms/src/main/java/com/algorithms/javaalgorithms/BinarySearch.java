package com.algorithms.javaalgorithms;

/**
 * @author yupanpan
 * @date 2020/8/19 22:17
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        int i =binarySearch(list,10);
        System.out.println(i);
    }

    /**
     * 实现二分查找，并返回查找到的数据下标
     * 参数：要查询的数据，要查询的数
     */
    public static int binarySearch(int[] array,int key) {
        // 如果数组为空，直接返回-1，即查找失败
        if (array == null) {
            return -1;
        }
        int low = 0;
        int hight = array.length-1;
        while(hight>=low){
            int mid = (low+hight)/2;
            if (key>array[mid]){
                low = mid+1;
            }else if(key<array[mid]){
                hight = mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
