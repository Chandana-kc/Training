package com.mindsprint.project1.Array;
import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,3};
        System.out.println("Original Array:" +Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array:" +Arrays.toString(numbers));
    }
}
