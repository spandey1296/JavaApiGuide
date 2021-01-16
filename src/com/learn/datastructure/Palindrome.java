package com.learn.datastructure;

import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
    public static boolean palindrome(int[] num, int index) {
        if (index > num.length/ 2)
            return true;
        if (num[index] == num[num.length - index - 1])
            return palindrome(num, index + 1);
        else
            return false;
    }
}
