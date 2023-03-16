package com.HinhTron;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        int Bankinh;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ban kinh: ");
            Bankinh = scanner.nextInt();
        }while(Bankinh<=0);
        HinhTron a = new HinhTron();
        a.r = Bankinh;
        double chuvi = a.Chuvi();
        System.out.println("Chu vi hinh tron ban kinh "+Bankinh+" la: " +chuvi);
        double dientich = a.Dientich();
        System.out.println("Chu vi hinh tron ban kinh "+Bankinh+" la: " +dientich);
    }
}
