package com.leetcode.solution;



import  java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {


         String str="()";

  Solutions ss= new Solutions();
  boolean b=ss.isValid(str);

        System.out.println("Given parenthesis is: " + b);


    }
}
class Solutions {
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }



}