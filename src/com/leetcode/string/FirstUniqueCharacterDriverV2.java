package com.leetcode.string;

/**
 * @author Vel
 * @date 19.03.2022
 * Link : https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterDriverV2 {
    public static void main(String[] args) {

        String inputString = "leetcode"; //#1 - Happy flow -PASS
//        String inputString = "e"; //#2 - single char input - PASS
//        String inputString = "aeiou"; //#3 - all unique chars - PASS
//        String inputString = "eeeeeeeee"; //#4 all duplicates - PASS
//        String inputString = "";
//        String inputString = "";
//        String inputString = "";
        FirstUniqueCharFinder firstUniqueCharFinder = new FirstUniqueCharFinder();
        System.out.println(firstUniqueCharFinder.findFirstUniqueCharacter(inputString));
    }
}

//Array based approach :
/*
  Approach :
   1. Create an array to store character frequency
   2. Then iterate thru array and find unique character
   3. return index of unique character
 */
class FirstUniqueCharFinder {

    public int findFirstUniqueCharacter(String inputString){

        int[] characterFrequency = new int[26];

        for(int loopIndex = 0; loopIndex < inputString.length(); loopIndex++){
            characterFrequency[inputString.charAt(loopIndex) - 'a']++;
        }

        for(int loopIndex = 0; loopIndex < inputString.length(); loopIndex++){
            if(characterFrequency[inputString.charAt(loopIndex) -'a'] == 1){
                return loopIndex;
            }
        }

        return -1;
    }

}
