package com.TinhDongGoi;

public class Program {
    public static void main(String[] args){
        Student nam = new Student();
//        nam.fullName= "Nam";
//        nam.address = "Ta Quang Buu";
//        nam.age = 18;
//        System.out.println(nam.fullName);
//
//        nam.showData();
        //nam.showData2();
        //ko goi dc vi showData2() trong "class Student" la "private"
        nam.setFullName("nam");
        System.out.println(nam.getFullName());

    }
}
