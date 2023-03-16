package com.tn;

public class Employee extends Person{
    @Override
    public void showFullName() {
        System.out.println("Full name is: Nguyễn Văn B");
    }

    public static void main(String[] args) {
        Person emp1 = new Employee();
        emp1.showFullName();
        emp1.showAge();
    }
}
