package com.mang;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }

        // Xuất giá trị các phần tử của mảng
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        Arrays.sort(a);
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        Mang arrNumber1 = new Mang(a);

        arrNumber1.printArrOnce();
        arrNumber1.printArrTwice();
    }
}
