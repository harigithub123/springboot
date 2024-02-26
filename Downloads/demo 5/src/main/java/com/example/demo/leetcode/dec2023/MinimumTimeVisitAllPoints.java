package com.example.demo.leetcode.dec2023;

/**
 * 3rd Dec
 */
public class MinimumTimeVisitAllPoints {
    public static void main(String[] args) {
        int[][] points = new int[][]{{3,2},{-2,2},{1,5}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int totalTimeToTravel = 0;
        for(int i =0 ; i< points.length-1; i++) {
            totalTimeToTravel += getTimeToTravel(points[i], points[i+1]);
        }
        return totalTimeToTravel;
    }

    public static int getTimeToTravel(int[] point1, int[] point2) {
        int pointsToTravelOnX = getDistanceBetweenPoint(point1[0],point2[0]);
        int pointsToTravelOnY = getDistanceBetweenPoint(point1[1],point2[1]);
        return Math.max(pointsToTravelOnX, pointsToTravelOnY);
    }

    private static int getDistanceBetweenPoint(int p1, int p2) {
        return p1 <= p2 ? Math.abs(p1 - p2) : Math.abs(p2 - p1);
    }
}
