package com.leetcode.string;

/**
 *
 */
public class ExcelColumnNameDriver {
    public static void main(String[] args) {

    }
}

class ExcelColumnNameFinder{
    public int titleToNumber(String columnTitle) {

        int characterCount = columnTitle.length();
        int columnNumber = 0;
        int  charIndex = characterCount - 1;
        //System.out.println(characterCount);
        for(int loopIndex = 0; loopIndex <= characterCount && charIndex >= 0; loopIndex++, charIndex--){

            columnNumber += (columnTitle.charAt(charIndex) - 'A' + 1 ) * Math.pow(26, loopIndex);
            //System.out.println((columnTitle.charAt(loopIndex) - 'A' + 1 ) * Math.pow(26, loopIndex));
        }
        return columnNumber;
    }
}