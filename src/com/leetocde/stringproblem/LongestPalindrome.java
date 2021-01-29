package com.leetocde.stringproblem;

public class LongestPalindrome {
    public static void main(String[] args) {

        String str = "a";
        SolutionPalindrome sp= new SolutionPalindrome();
        int result= sp.longestPalindrome(str);

        System.out.println("Length is: "+ result);


    }
    
}
class SolutionPalindrome {
    public int longestPalindrome(String s) {

        boolean[] check = new boolean[128];
        int longest = 0;

        for(char c : s.toCharArray()) {

            // set element to true if character not yet found
            // if character already found reset element to false
            check[c] = !check[c] ? true : false;

            // if character was reset, increase longest by 2
            if(!check[c]) longest += 2;

        }

        // if a character is left over increase longest by 1
        // (character put in the middle of the palindrome)
        if (s.length() > longest) longest++;
        return longest;




    }
}