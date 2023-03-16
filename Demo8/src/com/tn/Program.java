package com.tn;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap gia tri n: ");
//        int n = scanner.nextInt();

//        if (n<18){
//            throw new Exception("Can nhap n >=18");

//        String fullName = "Ngoc";
//        int lenFullName = fullName.length();
//        System.out.println(lenFullName);
//        if (fullName == null) {
//            throw new NullPointerException("fullName variable is null");
//        }
        StudentInfo studentInfo = new StudentInfo();
        Person p1 = new Person("Dung",18);

        studentInfo.showInfo(p1);

    }
}
