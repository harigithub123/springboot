package com.example.demo.leetcode.dec2023;

/**
 * 20th Dec 2023
 */
public class MaxProductOf2Element {
    public static void main(String[] args) {
        int[] arr = new int[]{5,5,1,3};
        System.out.println(maxProduct(arr));
        arr = new int[]{5,5,1,3,6,6};
        System.out.println(maxProduct(arr));
        arr = new int[]{5,5,1,3,6,6,7};
        System.out.println(maxProduct(arr));
        arr = new int[]{5,5,1,3,6,6,7,10,8};
        System.out.println(maxProduct(arr));
        arr = new int[]{5,5,1,3,6,6,7,8,10};
        System.out.println(maxProduct(arr));
        arr = new int[]{10,9,1,3,6,6,7,9,11};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int max, secondMax;
        if(nums[0]<=nums[1]){
            max = nums[1];
            secondMax = nums[0];
        } else {
            max = nums[0];
            secondMax = nums[1];
        }
        int length = nums.length;
        for (int i = 2; i<length;i++ ) {
            if(max <= nums[i]) {
                secondMax = max;
                max = nums[i];
            } else if(secondMax < nums[i]) {
                secondMax = nums[i];
            }
        }
        return (max-1)*(secondMax-1);
    }
}
