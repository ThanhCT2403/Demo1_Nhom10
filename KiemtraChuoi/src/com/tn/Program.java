package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi n: ");
        String n = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi m: ");
        String m = scanner.nextLine();
        KtraChuoi kt = new KtraChuoi();
        boolean kq = kt.Chuoi(n,m);
        if (kq==true){
            System.out.println("2 chuỗi là đảo ngược của nhau");
        }
        else{
            System.out.println("2 chuỗi không là đảo ngược của nhau");
        }

    }
}
