package com.mindsprint.project1.inherirance;

class ParentPhone{
    public void call(){
        System.out.println("Parent phone is calling");

    }
}
class ChildPhone extends ParentPhone{
    public void call(){
        super.call();
        System.out.println("Child phone is Calling");
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        ChildPhone alex = new ChildPhone();
        alex.call();
        System.out.println();

    }
}
