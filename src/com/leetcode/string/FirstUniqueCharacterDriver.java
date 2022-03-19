package com.leetcode.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Vel
 * @date 14.03.2022
 * Question name : First unique character in String
 * Question URL : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 105
 *     s consists of only lowercase English letters.
 */
public class FirstUniqueCharacterDriver {
    public static void main(String[] args) {

        //String inputString = "leetcode";//#1 - Happy flow - PASS
//        String inputString = "l";//#2 - Single char - PASS
//        String inputString = "ll";//#3 - No unique char - PASS
//        String inputString = "abcd";//#4 All unique chars - PASS
        String inputString = "aadadaad";//#5
        FirstUniqueCharacterFinder firstUniqueCharacterFinder =
                new FirstUniqueCharacterFinder();
        int result = firstUniqueCharacterFinder.firstUniqChar(inputString);
        System.out.println("Result is : " + result);

    }
}

/**
 * Approach :
 *  1. Iterate each character in string
 *  2. If it's not present in map, add it to the map and frequency as '1'
 *  3. Else, it's already present in the map and not required, remove it from map
 *  4. After completion of the iteration get the first entry of the map & return the index of it.
 */
class FirstUniqueCharacterFinder {
    public int firstUniqChar(String inputString) {

        Map<Character, Integer> characterFrequencyMap = new LinkedHashMap<Character, Integer>();
        Set<Character> characterSet = new HashSet<>();
        int firstUniqueCharacterIndex = -1;
        int inputSize = inputString.length();

        for(int loopIndex = 0; loopIndex < inputSize; loopIndex++){
            if(!characterSet.contains(inputString.charAt(loopIndex))){
                characterSet.add(inputString.charAt(loopIndex));
                characterFrequencyMap.put(inputString.charAt(loopIndex), loopIndex);
            }
            else {
                characterFrequencyMap.remove(inputString.charAt(loopIndex));
            }
        }

        for (Map.Entry<Character, Integer> entrySet :
                characterFrequencyMap.entrySet()) {
            if(entrySet.getKey() != null){
                firstUniqueCharacterIndex = entrySet.getValue();
                break;
            }
        }
        return firstUniqueCharacterIndex;
    }
}