package com.tn;

public class Program {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        System.out.println(st1);
//
//        Student.setSchoolName("DH HN");
//        System.out.println(st1);
//
//        Student st2 = new Student();
//        System.out.println(st2);
        Person.showData();

        Integer money = 1000;//cho phep co gia tri null, con int thi ko
        Student student = new Student();
        Integer chuvi1 = student.getChuVi(5,6);
        System.out.println(chuvi1);
        Integer chuvi2 = student.getChuVi(null,10);
        System.out.println(chuvi2);

        if(chuvi1 == null){
            System.out.println("Gia tri nhap vao chua dung");
        }
        else {
            System.out.println("Chu vi "+chuvi1);
        }
    }
}
