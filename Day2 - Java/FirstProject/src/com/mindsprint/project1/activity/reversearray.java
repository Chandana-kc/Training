package com.mindsprint.project1.activity;

public class reversearray {
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,5,6};
        System.out.println("Original Array");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");

        }
        System.out.println("Reversed Array");
        for(int i=numbers.length - 1;i>=0;i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
