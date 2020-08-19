package com.algorithms.javaalgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yupanpan
 * @date 2020/8/19 22:46
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {7,1,3,2,11,34,6,9,32,8};
        int target = 13;
        int[] result = twoSum2(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum2(int[] number,int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< number.length;i++){
            if(map.containsKey(target-number[i])){
                result[0] = i;
                result[1] = map.get(target-number[i]);
                return result;
            }
            map.put(number[i],i);
        }
        return result;
    }
}
