package com.example.demo.leetcode;

import java.util.Scanner;

public class FindAngleBetweenWatchHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float hours, mins;
        hours = s.nextFloat();
        mins = s.nextFloat();
        float angleForMinHandPerMin = 6;
        float angleForHourHandPerHour = 30;
        float angleForHourHandPerMin = 0.5f;
        float angleForMin = mins*angleForMinHandPerMin;
        float angleForHour = hours*angleForHourHandPerHour + mins*angleForHourHandPerMin;
        System.out.println(Math.abs(angleForHour-angleForMin));

    }
}
