package com.leetcode.array;

/**
 * @author Vel
 * @date 10/09/22 : 11:12
 * Question link : https://leetcode.com/problems/plus-one/
 * Question name : Plus one
 * Question desc : Add one to a given number (digits in integer array)
 */
public class PlusOneDriver {
    public static void main(String[] args) {

    }
}

class PlusOneFinder {
    public int[] plusOne(int[] digits) {
        /*
        Iterate thru every digit
        if digit is not '9' -> increment & break loop
        if digit is '9' -> replace with zero & continue

        */

        for(int loopIndex = digits.length-1; loopIndex >= 0; loopIndex--){

            if(digits[loopIndex] != 9){
                digits[loopIndex]++;
                break;
            }
            else {
                digits[loopIndex] = 0;
            }
        }

        if(digits[0] == 0){
            int[] newArray = new int[digits.length+1];
            newArray[0] = 1;
            return newArray;
        }

        return digits;
    }
}