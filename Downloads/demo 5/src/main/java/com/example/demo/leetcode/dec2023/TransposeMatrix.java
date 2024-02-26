package com.example.demo.leetcode.dec2023;

/**
 * 20th Dec 2023
 */
public class TransposeMatrix {
    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
