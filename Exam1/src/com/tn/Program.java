package com.tn;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        int c;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao n: ");
            c = scanner.nextInt();
        } while(c<=0);
        UocSo b = new UocSo();
        b.a = c;
        int tich = b.Tich();
        System.out.println(" Tich cac uoc so cua "+ c + " la: " + tich);
        int tong = b.Tong();
        System.out.println(" Tich cac uoc so cua "+ c + " la: " + tong);
    }
}
