package com.gfg.problem;


import java.util.*;

public class FibonacciProblem {

    public static void main(String[] args) {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            //taking total number of elements
            int n = sc.nextInt();

            //calling printFibb() method
            long[] res = printFibb(n);

            //printing the elements of the array
            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }


    // } Driver Code Ends


//User function Template for Java


    public static long[] printFibb(int n) {
        long[] ans = new long[n];
        ans[0] = 1;
        if (n == 1) {
            return ans;
        }
        ans[1] = 1;
        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans;

    }

}