package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Method1 {

    public static void main(String[] args) {


        List<Integer> val= Arrays.asList(1,2,3,4,5,6);

        //consumer interface is @FunctionalInterface accepts only one parameter as agrument of type Generics
        //1. method
        Consumer<Integer> c= new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

                System.out.println("Expression value of list:" + integer);

            }
        };
        val.forEach(c);



    }
}
