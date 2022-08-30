package com.leetcode.array;

/**
 * @author Vel
 * @date 30/08/22 : 22:18
 * Question link : https://leetcode.com/problems/rotate-image/
 * Question name : Rotate image
 * Question desc :
 */
public class RotateImageDriver {
    public static void main(String[] args) {

    }
}

class ImageRotator{

    public void rotate(int[][] matrix) {
        transpose(matrix);
        interchangeColumns(matrix);
    }

    public void transpose(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            for(int column = row+1; column < matrix[0].length; column++) {
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
        }
    }

    public void interchangeColumns(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            int startColumn = 0;
            int endColumn = matrix[0].length-1;
            while(startColumn < endColumn){
                int temp = matrix[row][startColumn];
                matrix[row][startColumn++] = matrix[row][endColumn];
                matrix[row][endColumn--]   = temp;

            }
        }
    }
}