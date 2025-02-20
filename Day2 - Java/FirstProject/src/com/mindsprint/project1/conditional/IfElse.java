package com.mindsprint.project1.conditional;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
       // int num=sc.nextInt();
        //if(num>0)
          //  System.out.println("Number is positive");
        //else if(num==0)
          //  System.out.println("Number is Zero");
        //else
          //  System.out.println("Number is Negative");
        int percent=sc.nextInt();
        if(percent>=70 && percent<=100)
            System.out.println("Congratulations...!! You got Distinction");
        else if(percent>=60 && percent<70)
            System.out.println("Congratulations...!! You got First class");
        else if(percent>=50 && percent<60)
            System.out.println("Congratulations...!! You got Second class");
        else if(percent>=0 && percent<35)
            System.out.println("Sorry Your Fail");
        else
            System.out.println("Kindly Enter the correct percentage");
        }
    }

