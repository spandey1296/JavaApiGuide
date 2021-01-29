package com.leetocde.stringproblem;

public class ReverseString {


    public static void main(String[] args) {

        StringReversing str= new StringReversing();
       String result= str.reverseWords("hello world, I'm shivant pandey ");
        System.out.println(result);

    }


}
class StringReversing {
    public String reverseWords(String s) {



        int lo = 0, hi = 0;
        char[] arr = s.toCharArray();

        while (hi < arr.length) {
            while (hi < arr.length && arr[hi] != ' ') hi++;
            reverse(arr, lo,hi-1);
            hi++;
            lo = hi;
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int lo, int hi) {
        int mid = (lo + (hi - lo) / 2) + 1;

        for (int i = lo; i < mid; i++) {
            char tmp = arr[i];
            arr[i] = arr[lo + hi - i];
            arr[lo + hi - i] = tmp;
        }


    }
}




/*
alternate solution to reverse string

class Solution {
    public String reverseWords(String s) {



        ArrayList<String> list = new ArrayList<>();
        for (String word : s.split(" ")) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            list.add(sb.toString());
        }

        return String.join(" ", list);

    }
}*/
