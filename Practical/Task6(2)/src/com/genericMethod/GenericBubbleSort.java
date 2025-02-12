package com.genericMethod;

import java.util.Arrays;

public class GenericBubbleSort {
    // Generic Bubble Sort Method
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping happened, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        bubbleSort(intArray);
        System.out.println("Sorted Integers: " + Arrays.toString(intArray));
        
        // Test with Double array
        Double[] doubleArray = {3.2, 1.5, 4.8, 2.9};
        bubbleSort(doubleArray);
        System.out.println("Sorted Doubles: " + Arrays.toString(doubleArray));
        
        // Test with String array
        String[] stringArray = {"Banana", "Apple", "Cherry", "Mango"};
        bubbleSort(stringArray);
        System.out.println("Sorted Strings: " + Arrays.toString(stringArray));
    }
}
