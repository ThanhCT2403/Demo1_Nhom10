package Bai3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao so nguyen n: ");
            n = input.nextInt();
        }while(n <= 0);
        UocSo uocSo = new UocSo();
        uocSo.n = n;
        int tong = uocSo.Tong();

        System.out.println("Tong cua uoc chan la: "+tong);
    }
}
