package com.example.demo.leetcode.dec2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Daily Challenge date - 14th Dec 2023
 * Problem Solved Date  - 20th Dec 2023
 */
public class DifferenceBetOnceAndZeros {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int grid[][] = new int[][]{{0,1,1},{1,0,1},{0,0,1}};
        displayGrid(onesMinusZeros(grid));
        grid = new int[][]{{1,1,1},{1,1,1}};
        displayGrid(onesMinusZeros(grid));
        System.out.println(System.currentTimeMillis()-startTime);
        List<Integer> l = new ArrayList<>();
    }

    private static void displayGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(grid[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        List<Integer> oneCountRowList = new ArrayList<>(Collections.nCopies(rows,0));
        List<Integer> oneCountColList = new ArrayList<>(Collections.nCopies(cols,0));
        int oneCountInRow[] = new int[rows];
        int oneCountInCol[] = new int[cols];
        int diff[][] = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int elem = grid[row][col];
                oneCountInRow[row]+=elem;
                oneCountInCol[col]+=elem;
            }
        }

        int rowPlusColumns = rows+cols;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                diff[row][col] = (oneCountInRow[row] << 1)
                        + (oneCountInCol[col] << 1) - rowPlusColumns;
            }
        }
        return diff;
    }
}
