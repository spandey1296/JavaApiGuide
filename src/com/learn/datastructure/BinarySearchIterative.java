package com.learn.datastructure;


/*Author: shivantpandey
portfolio:spandey1296.github.io
*/
public class BinarySearchIterative {
    public static void main(String[] args) {

        int[] array = {1, 4, 7, 9, 16, 56, 70};
        int n = 7;
        int element = 9;
        int found_index = recursiveBinarySearch(array, 0, n - 1, element);
        if (found_index == -1) {
            System.out.println("Element not found in the array ");
        } else {
            System.out.println("Element found at index:"+ found_index);
        }

    }

    public static int recursiveBinarySearch(int[] array, int start_index, int end_index, int element) {
        if (end_index >= start_index) {
            int middle = start_index + (end_index - start_index) / 2;
            if (array[middle] == element)
                return middle;
            if (array[middle] > element)
                return recursiveBinarySearch(array, start_index, middle - 1, element);
            return recursiveBinarySearch(array, middle + 1, end_index, element);
        }
        return -1;
    }
}
