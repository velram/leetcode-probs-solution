package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vel
 * @date 28/09/22 : 20:44
 * Question link : https://leetcode.com/problems/two-sum/
 * Question name : Two Sum
 * Question desc : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSumDriver {
    public static void main(String[] args) {

    }
}

class TwoSumFinder {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        int[] result = new int[2];
        for(int loopIndex = 0; loopIndex < nums.length; loopIndex++){
            int requiredValue = target - nums[loopIndex];

            if(valueIndexMap.containsKey(requiredValue)){
                result[0] = valueIndexMap.get(requiredValue);
                result[1] = loopIndex;
                return result;
            }
            valueIndexMap.put(nums[loopIndex],loopIndex);
        }
        return null;
    }
}
