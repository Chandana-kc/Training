package com.mindsprint.project1.oops;

class Student {
    String name;
    int[] grades;

    public Student (String name,int[] grades){
        this.name=name;
        this.grades=grades;
    }
    public double calculateAverage(){
        int sum=0;
        for(int grade : grades){
            sum+=grade;

        }
        return(double)sum/grades.length;

    }
    public  void Display(){
        System.out.println("Student name:" +name);
        System.out.println("Average grade:" +calculateAverage());
    }

    public static void main(String[] args) {
        int[] grades= {69,89,90,80,};
        Student student1=new Student("Chandana",grades);
        student1.Display();
    }
}

