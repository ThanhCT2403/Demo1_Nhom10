package com.tn;

public class Student implements StudentInterface {
    @Override
    public void showData() {
        System.out.println("Information is name and age");

    }

    @Override
    public void saveData() {
        System.out.println("save information");
    }
}
