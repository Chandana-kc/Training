package com.mindsprint.project1.inherirance;
class Parent{
    public String name="Test";
    public Parent(){

    }
    public void hello(){
        System.out.println("Hello From Parent");
    }
}
class Child extends Parent{
    public Child() {
        super();
        System.out.println("Child Constructor");
    }
    public void print(){
        System.out.println("Welcome " +name);

    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Child child=new Child();
        child.print();
        child.hello();
        System.out.println(child.name);
    }
}
