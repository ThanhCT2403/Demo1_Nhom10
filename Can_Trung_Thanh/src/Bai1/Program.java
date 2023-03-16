package Bai1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        int x;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao n: ");
            n = scanner.nextInt();
        }while(n<=0);
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao x: ");
            x = scanner.nextInt();
        }while(x<=0);
        TinhSn tinhSn = new TinhSn();
        tinhSn.n = n;
        tinhSn.x = x;
        double tong = tinhSn.Tich();
        System.out.println("Tong cua S(n) la: "+tong);

    }
}
