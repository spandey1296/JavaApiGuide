package com.company;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        //Lambda can be replaced using method reference
         values.forEach(System.out::println);

    }
}
