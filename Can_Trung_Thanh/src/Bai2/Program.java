package Bai2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao so nguyen duong n: ");
            n = input.nextInt();
        }while(n <= 0);
        UocSo uocSo = new UocSo();
        uocSo.n = n;
        uocSo.Uoc();
    }
}
