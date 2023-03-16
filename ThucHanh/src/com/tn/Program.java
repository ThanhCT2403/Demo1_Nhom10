package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Danh sách nhân sự");
        System.out.println("3. Danh sách phòng ban");
        System.out.println("4. Xoá nhân viên khỏi phòng ban");
        System.out.println("5. Danh sách nhân viên theo phòng ban");
        System.out.println("6. Thoát!");
        int n;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao so n");
            n= scanner.nextInt();
        }while (n<1||n>6);
        if(n==1) {
            System.out.println("Ban da login");

            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap vao so n");
                n= scanner.nextInt();
            }while(n<2||n>6);
            if (n==2){
                System.out.println("2. Danh sách nhân sự");
                System.out.println("-------------------------------------");
                System.out.println("    1. Thêm nhân sự");
                System.out.println("    2. Sửa nhân sự");
                System.out.println("    3. Xoá nhân sự");
                System.out.println("    4. Tìm kiếm theo tên");
                System.out.println("    5. Tìm kiếm nhân sự theo mã");
                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap vao so n");
                    n= scanner.nextInt();
                }while(n<1||n>5);
                switch (n){
                    case 1:
                        System.out.println("    1. Thêm nhân sự");
                        break;
                    case 2:
                        System.out.println("    2. Sửa nhân sự");
                        break;
                    case 3:
                        System.out.println("    3. Xoá nhân sự");
                        break;
                    case 4:
                        System.out.println("    4. Tìm kiếm theo tên");
                        break;
                    case 5:
                        System.out.println("    5. Tìm kiếm nhân sự theo mã");
                        break;
                }
            } else if (n==3) {
                System.out.println("3. Danh sách phòng ban");
                System.out.println("-------------------------------------");
                System.out.println("    1. Thêm phòng ban");
                System.out.println("    2. Cập nhật tên phòng ban");
                System.out.println("    3. Thêm nhân viên vào phòng ban");
                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap vao so n");
                    n= scanner.nextInt();
                }while(n<1||n>3);
                switch (n){
                    case 1:
                        System.out.println("    1. Thêm phòng ban");
                    case 2:
                        System.out.println("    2. Cập nhật tên phòng ban");
                    case 3:
                        System.out.println("    3. Thêm nhân viên vào phòng ban");
                }
            }else if (n==4){
                System.out.println("4. Xoá nhân viên khỏi phòng ban");
            } else if (n==5) {
                System.out.println("5. Danh sách nhân viên theo phòng ban");
            }
        } else if (n==6) {
            System.out.println("6. Thoát!");
        }
        else {
            System.out.println("Ban phai login");
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap vao so n");
                n= scanner.nextInt();
            }while(n<2||n>6);
        }
    }
}
