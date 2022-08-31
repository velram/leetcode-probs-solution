package com.leetcode.array;

/**
 * @author Vel
 * @date 31/08/22 : 23:31
 * Question link : https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 * Question name : Rotate array
 * Question desc :
 */
public class RotateArrayDriver {
    public static void main(String[] args) {

    }
}

class RotateArrayTools {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    public void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }

    }
}