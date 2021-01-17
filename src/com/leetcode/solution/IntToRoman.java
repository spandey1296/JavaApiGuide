package com.leetcode.solution;


import java.util.*;

public class IntToRoman {

    public static void main(String[] args) {

        String str = "DCIII";
    Solution ss= new Solution();
   int rst= ss.romanToInt(str);
        System.out.printf(String.valueOf(rst));




    }

}
class Solution {
    public int romanToInt(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
            Map<Character, Integer> charMap = new HashMap<>();
            charMap.put('I', 1);
            charMap.put('V', 5);
            charMap.put('X', 10);
            charMap.put('L', 50);
            charMap.put('C', 100);
            charMap.put('D', 500);
            charMap.put('M', 1000);
            int result = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (charMap.get(s.charAt(i)) >= charMap.get(s.charAt(i + 1))) {
                    result = result + charMap.get(s.charAt(i));

                } else {
                    result = result - charMap.get(s.charAt(i));

                }
            }

            result = result + charMap.get(s.charAt(s.length() - 1));

            return result;


    }
}