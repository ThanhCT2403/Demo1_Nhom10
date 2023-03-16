package com.tn;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        //Tao 1 stack voi kieu Integer
        Stack<Integer> stk = new Stack<>();
        //Mac dinh khi khoi tao stack se la rong
        System.out.println("Stack la rong khi khoi tao? "+stk.empty());
        //Push phan tu: 20,13,89,90,11,45,18 vao dinh Stack
        stk.push(20);
        stk.push(13);
        stk.push(89);
        stk.push(90);
        stk.push(11);
        stk.push(45);
        stk.push(18);
        //Kiem tra stack con rong sau khi push hay khong?
        System.out.println("Stack la rong sau khi push? "+stk.empty());
        //Hien thi cac phan tu trong stack ban dau
        System.out.println("Phan tu Stack ban dau: "+stk);

        //Pop phan tu 18,45,11 tren dinh Stack bang phuong phap pop()
        //Lay ra va xoa phan tu 18
        System.out.println("Phan tu duoc lay ra va xoa khoi Stack: "+stk.pop());
        //Lay ra va xoa phan tu 45
        System.out.println("Phan tu duoc lay ra va xoa khoi Stack: "+stk.pop());
        //Lay ra va xoa phan tu 11
        System.out.println("Phan tu duoc lay ra va xoa khoi Stack: "+stk.pop());
        //Stack sau khi pop 3 phan tu
        System.out.println("Phan tu Stack sau khi pop 3 phan tu: "+stk);


    }
}
