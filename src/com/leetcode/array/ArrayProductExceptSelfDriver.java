package com.leetcode.array;

import java.util.Arrays;

/**
 * @author vel
 * @date : 01.04.2022
 * Link : https://leetcode.com/problems/product-of-array-except-self/
 *
 */
public class ArrayProductExceptSelfDriver {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};//#1 - Happy flow - PASS
//        int[] nums = {-1,1,0,-3,3};//#
//        int[] nums = {1,2};//#3 - Corner case - only 2 elements
//        int[] nums = {};//#
//        int[] nums = {};//#
//        int[] nums = {};//#
//        int[] nums = {};//#
//        int[] nums = {};//#
        ArrayProductExceptSelfFinder arrayProductExceptSelfFinder = new ArrayProductExceptSelfFinder();
        int[] result = arrayProductExceptSelfFinder.productExceptSelf(nums);
        Arrays.stream(result).forEach(element -> System.out.println(element));

    }
}

class ArrayProductExceptSelfFinder {
    public int[] productExceptSelf(int[] nums) {

        int[] arrayProduct = new int[nums.length];
        int[] prefixProduct = findPrefixProduct(nums);
        int[] suffixProduct = findSuffixProduct(nums);

        arrayProduct[0] = suffixProduct[1];
        arrayProduct[nums.length - 1] = prefixProduct[nums.length - 2];

        for(int loopIndex = 1; loopIndex < nums.length - 1; loopIndex++){
            arrayProduct[loopIndex] = suffixProduct[loopIndex + 1] * prefixProduct[loopIndex - 1];
        }



        return arrayProduct;
    }

    private int[] findPrefixProduct(int[] nums) {

        int[] prefixProduct = new int[nums.length];

        prefixProduct[0] = nums[0];

        for(int loopIndex = 1; loopIndex < nums.length; loopIndex++){
            prefixProduct[loopIndex] = prefixProduct[loopIndex - 1] * nums[loopIndex];
        }

        return prefixProduct;
    }

    private int[] findSuffixProduct(int[] nums){
        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length - 1] = nums[nums.length - 1];

        for(int loopIndex = nums.length - 2; loopIndex >= 0; loopIndex--){
            suffixProduct[loopIndex] = suffixProduct[loopIndex + 1] * nums[loopIndex];
        }

        return suffixProduct;
    }
}
