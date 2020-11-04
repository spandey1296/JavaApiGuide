package com.company;

import java.util.Arrays;
import java.util.List;

public class Method2 {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Using For loop to print the array values");
        //1. for loop for printing the list
        for (int i = 0; i < values.size(); i++) {
            System.out.println("Element of the array:" + values.get(i));


        }
    }
}
