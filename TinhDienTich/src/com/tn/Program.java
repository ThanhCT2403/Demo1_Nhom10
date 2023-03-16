package com.tn;
import  java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int chieuDai = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        int chieuRong = scanner.nextInt();
        Rectange a = new Rectange();
        a.d = chieuDai;
        a.r = chieuRong;

        int dientich = a.dientichhcn();
        System.out.println("Dien tich hcn: " + dientich);
        int chuvi = a.chuvihcn();
        System.out.println("Chu vi hcn: " + chuvi);
        Square b = new Square(3);
        int dientichhv = b.dientichhv();
        System.out.println("Dien tich hinh vuong: " + dientichhv);
        int chuvihv = b.chuvihv();
        System.out.println("Chu vi hinh vuong: " + chuvihv);
    }
}
