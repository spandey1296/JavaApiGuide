package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        //2. Using Iterator
       /* Iterator<Integer> i= values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());

        }*/

        // 3. advance for loop

        /*for (int c:values)
        {
            System.out.println(c);

        }*/
        //External iteration
 // Internal Iterations can be implemented using stream API


     //4. Lambda express  using consumer interface
    // values.forEach(i -> System.out.println(i));


    //5. Lambda can be replaced using method reference
      //  values.forEach(System.out::println);











    }
}
