package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        List<Integer> val= Arrays.asList(1,2,3,4,5,6);

         //consumer interface is @FunctionalInterface accepts only one parameter as agrument of type Generics
        //1. method
        Consumer<Integer> c= new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

                System.out.println(integer);

            }
        };
        val.forEach(c);


        //2. modification
/*
      Consumer<Integer> cs= i -> System.out.println(i);
         val.forEach(cs);*/

        //3. More modification using consumer interface

        val.forEach(new Consumer<Integer>() {           //anonymous class
            @Override
            public void accept(Integer i) {
                System.out.println(i);

            }
        });


 // 3 types of interface
        //Normal interface
        //marker interface -> without any method
        // SAM interface -> Single abstract method interface
        // SAM interface is now known as functional interface
        //only one method declared in case of Functional Interface














    }
}
