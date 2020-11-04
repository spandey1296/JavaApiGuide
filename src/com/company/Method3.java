package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Method3 {

    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

      // Using Iterator
       Iterator<Integer> i= values.iterator();
        while(i.hasNext())
        {
            System.out.println("Element of the arrya:" + i.next());

        }

    }
}
