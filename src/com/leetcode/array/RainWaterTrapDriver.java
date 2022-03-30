package com.leetcode.array;

/**
 * @author vel
 * Question : Rain water trapping
 * link : https://leetcode.com/problems/trapping-rain-water/
 *
 */
public class RainWaterTrapDriver {
    public static void main(String[] args) {

//        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};//#1 - Happy flow
        int[] height = {4,2,0,3,2,5};//#2 sample test case
//        int[] height = {};//#
//        int[] height = {};//#
//        int[] height = {};//#
//        int[] height = {};//#
//        int[] height = {};//#
//        int[] height = {};//#
        RainWaterCountTool rainWaterCountTool = new RainWaterCountTool();
        System.out.println(" Rain water trapped : " + rainWaterCountTool.trap(height));
    }
}

class RainWaterCountTool {
    public int trap(int[] height) {

        if(null == height || height.length == 0){
            return 0;
        }

        int waterTrapped = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while(left < right) {

            if(height[left] < height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else {
                    waterTrapped += maxLeft - height[left];
                }
                left++;
            }
            else {
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else {
                    waterTrapped += maxRight - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
