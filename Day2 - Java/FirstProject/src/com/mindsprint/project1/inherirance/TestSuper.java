package com.mindsprint.project1.inherirance;

class Base{
    int num;
    Base(int num){
        this.num=num;
}
class Derived extends Base{
    Derived(int data){
        super(10);
    }
}


public class TestSuper {
    public static void main(String[] args) {
        Derived d = new Derived(89);
        System.out.println(d.num);

    }
}
}
