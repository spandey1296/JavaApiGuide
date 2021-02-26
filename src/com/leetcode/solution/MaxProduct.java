package com.leetcode.solution;

public class MaxProduct {


    public static void main(String[] args) {







    }
    public  static int maxProductFind(int[] nums){

        if (nums==null || nums.length==0) return 0;

        if (nums.length==1);
        return nums[0];
        int currProduct=1,maxProduct=0;

        for (int i=0;i<nums.length;i++)
        {
            currProduct*=nums[i];
            maxProduct=Math.max(maxProduct,currProduct);
            if (currProduct==0) currProduct=1;

        }




    }








}