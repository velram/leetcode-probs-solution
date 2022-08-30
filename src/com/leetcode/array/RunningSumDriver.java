package com.leetcode.array;

/**
 * @author Vel
 * @date 29/08/22 : 22:11
 * Question link : https://leetcode.com/problems/running-sum-of-1d-array/
 * Question name : Runnign sum of 1D array
 * Question desc :
 */
public class RunningSumDriver {
    public static void main(String[] args) {

    }
}

class RunningSumFinder {
    public int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for(int loopIndex = 1; loopIndex < nums.length; loopIndex++){
            runningSum[loopIndex] = runningSum[loopIndex - 1] + nums[loopIndex];
        }

        return runningSum;
    }
}