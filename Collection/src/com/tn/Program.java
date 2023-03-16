package com.tn;

import java.lang.annotation.ElementType;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        List listNumber = new ArrayList();
        //add(): Them phan tu
        //size: Tra ve so luong phan tu
        //get(2): Lay gia tri phan tu thu 2
        //remove(): Xoa di 1 phan tu
        //clear(): Xoa tat ca phan tu
        //trim(): Cat dau cach thua 2 dau
        //Split(" ") => "Ngyen","Van","A"
        //char result = fullName.charA(0);
        int size =listNumber.size();
        System.out.println("size: "+size);

        Integer num1 = 10;
        listNumber.add(num1);
        listNumber.add(11);
        listNumber.add(12);
        listNumber.add(13);
        listNumber.add(14);
        listNumber.add(15);
//        System.out.println("size: "+listNumber.size());
//
//        for (int i =0;i<listNumber.size();i++){
//            System.out.println("Element " + listNumber.get(i));
//        }
//        listNumber.remove(1);
//        for (int i =0;i<listNumber.size();i++){
//            System.out.println("Element " + listNumber.get(i));
//        }
        listNumber.add(20);
        listNumber.add(21);
        listNumber.add(22);

        listNumber.add(30);
        listNumber.add(31);
        listNumber.add(32);
        System.out.println("Size "+listNumber.size());
        //In ra gia tri <20 hoac>29


    }
}
