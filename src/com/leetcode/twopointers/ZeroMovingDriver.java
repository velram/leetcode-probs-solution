package com.leetcode.twopointers;

/**
 * @author Vel
 * @date 12/09/22 : 23:04
 * Question link : https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 * Question name : Move zeroes
 * Question desc : Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 *
 * Constraints:
 *
 *     1 <= nums.length <= 104
 *     -2^31 <= nums[i] <= 2^31 - 1
 */
public class ZeroMovingDriver {
    public static void main(String[] args) {

    }
}

/*   A pointer for zeroCount
     Move the loop pointer
     If u find zero - increment zeroCount
     If u find non-zero - swap the elements use this logic - (looIndex - zeroCount)
     Repeat this till last element
     Edge case : Single non-zero element (handle by ignoring if zeroCount < 1)
*/
class ZeroMover {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for(int loopIndex = 0; loopIndex < nums.length; loopIndex++){
            if(nums[loopIndex] == 0){
                zeroCount++;
            }
            else if(nums[loopIndex] != 0 && zeroCount > 0){
                nums[loopIndex - zeroCount] = nums[loopIndex];
                nums[loopIndex] = 0;
            }
        }
    }
}