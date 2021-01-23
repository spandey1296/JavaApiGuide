package com.learn.datastructure;


import  java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        boolean found = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                found = false;
                break;
            }
        }

        if (found)
            System.out.println("Yes");

                    else
            System.out.println("no");;

            //alternate method

       // System.out.println(found ? "Yes" : "No");







    }
    
}
