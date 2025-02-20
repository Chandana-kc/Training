package com.mindsprint.project1.loops;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.println(i+" , ");

        }
        System.out.println("\nWhile Loop");
        int i=1;
        while(i<=10){
            System.out.print(i + " , ");
            i++;
        }
        System.out.println("\nDo While loop");
        do {
            System.out.println(i + " , ");
            i++;
        }while(i<10);
    }
}
