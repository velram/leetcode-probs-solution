package com.leetcode.array;

/**
 * @author Vel
 * @date 08.03.2022
 * Leetcode link : https://leetcode.com/problems/maximum-subarray/
 *
 */
public class MaxSubArraySumDriver {
    public static void main(String[] args) {

        //int[] inputArray = {-2,   1, -3, 4, -1, 2, 1 ,-5 ,4};//#1 - Happy flow
        int[] inputArray = {-2,   1};

        MaxSubArraySumFinder maxSubArraySumFinder = new MaxSubArraySumFinder();
        int maxSubArraySum = maxSubArraySumFinder.maxSubArray(inputArray);

        System.out.println("Max sub array sum is : " + maxSubArraySum);

    }
}

/**
 * Approach :
 *  1. Find prefix sum array
 *  2. Find a maxSum in prefix array
 *  3. If currentSum > maxSum then find the difference
 */
class MaxSubArraySumFinder {
    public int maxSubArray(int[] nums) {

        int maxSubArraySum = Integer.MIN_VALUE;
        int currentSum = 0;

        if(nums.length == 0 ){
            return nums[0];
        }
        for(int loopIndex = 1; loopIndex < nums.length; loopIndex++ ) {
            currentSum = currentSum + nums[loopIndex];
            maxSubArraySum = Math.max(currentSum, maxSubArraySum);
            if(currentSum < 0) {
                currentSum = 0;
            }
            /*
              We do this to avoid negative values getting added twice (in prefix sum)
              currentSum variable is used to calculate prefixSum
             */
        }
        return maxSubArraySum;
    }
}