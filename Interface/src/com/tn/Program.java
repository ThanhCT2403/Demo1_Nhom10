package com.tn;

public class Program {
    public static void main(String[] args) {
        Student student = new Student();
//        student.showData();
//        student.saveData();
        StudentInterface st2 = new Student();
        st2.showData();
        st2.saveData();
    }
}
