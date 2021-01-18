package com.leetcode.solution;

public class StringMatch {

    public static void main(String[] args) {

Squareroot sr=new Squareroot();
 double result= sr.mySqrt(16);
        System.out.println(result);



    }
}
class Squareroot {
    public int mySqrt(int x) {

        if(x < 2) return x;
        int low = 1, high = x / 2, mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(mid == x / mid) return mid;
            else if(mid < x / mid) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
}