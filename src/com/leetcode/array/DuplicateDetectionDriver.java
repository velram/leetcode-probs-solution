package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Velmurugan
 * @date 08.03.2022
 *
 */
public class DuplicateDetectionDriver {
    public static void main(String[] args) {

    }
}

/**
 * Approach :
 * --------------------
 *   - Create a Set
 *   - Lookup for element
 *   - If present - exit loop
 *   - return true
 *   - End of loop - return false
 *
 *
 *   S.C - O(n) | T.C - O(n)
 *
 *   Test cases :
 *    - Empty list
 *    - Single entry list
 *    - No duplicates
 *    - Duplicates present
 *    - Single duplicate element
 *    - Multiple duplicate element
 */
class DuplicateFinder {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> uniqueElementSet = new HashSet<>();

        for(int currentNumber : nums){
            if(!uniqueElementSet.add(currentNumber)){
                return true;
            }
        }
        return false;
    }
}
