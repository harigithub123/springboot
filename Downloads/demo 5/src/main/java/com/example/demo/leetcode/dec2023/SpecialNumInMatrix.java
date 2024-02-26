package com.example.demo.leetcode.dec2023;

import java.util.HashMap;
import java.util.Map;

public class SpecialNumInMatrix {

    public static void main(String[] args) {
        int[][] mat = new int[][] {{1,0,1},{0,1,0},{1,0,1}};
        System.out.println(numSpecial(mat));
        mat = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(numSpecial(mat));
        mat = new int[][] {{0,0,1},{0,1,0},{1,0,1}};
        System.out.println(numSpecial(mat));
        mat = new int[][] {{0,0,1,0},{0,1,0,0},{1,0,0,1}};
        System.out.println(numSpecial(mat));
    }
    public static int numSpecial(int[][] mat) {
        Map<Integer, Integer> rowColMap = new HashMap<>();
        int[] columWiseCount = new int[mat[0].length];
        int rows = mat.length, cols = mat[0].length;
        for (int row = 0; row < rows; row++) {
            int colIndex = -1, rowWiseCount = 0;
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 1) {
                    rowWiseCount++;
                    colIndex = col;
                    columWiseCount[col]++;
                }
            }
            if(rowWiseCount==1) {
                rowColMap.put(row, colIndex);
            }
        }
        int specialPositionCount=0;
        for(Map.Entry<Integer,Integer> entry: rowColMap.entrySet()) {
            if(columWiseCount[entry.getValue()] == 1) {
                specialPositionCount++;
            }
        }
        return specialPositionCount;
    }
}
