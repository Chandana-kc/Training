package com.mindsprint.project1.basic;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter age");
        //int age=scanner.nextInt();

        //String result = (age>=18)? "Valid for Vote" : "Not a valid for vote";
        //System.out.println();

        System.out.println("Enter The Selling Price: ");
        int sp=scanner.nextInt();
        System.out.println("Enter the purchase price:");
        int pp=scanner.nextInt();
        String res= (sp>pp)? "selling price" +(sp-pp): "loss :" +(pp-sp);
        System.out.println(res);

    }
}
