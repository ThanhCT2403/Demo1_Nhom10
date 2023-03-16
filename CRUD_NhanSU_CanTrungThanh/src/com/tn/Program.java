package com.tn;

import java.sql.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        System.out.println("-------------------------------------");
        System.out.println("1. Login");
        System.out.println("2. show list");
        System.out.println("3. Thêm nhân sự");
        System.out.println("4. Sửa nhân sự");
        System.out.println("5. Xoá nhân sự");
        System.out.println("6. Thoát!");
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao lua chon tu 1-6: ");
            n = scanner.nextInt();
        }while(n<1 || n>6);
        while (1<n &&n<6){
            System.out.println("Ban chua login, can nhap lai: ");
            Scanner scanner = new Scanner(System.in);
            n= scanner.nextInt();
        }
        if (n==1){
            System.out.println("-------------------------------------");
            System.out.println("Ban da login");
            System.out.println("2. show list");
            System.out.println("3. Thêm nhân sự");
            System.out.println("4. Sửa nhân sự");
            System.out.println("5. Xoá nhân sự");
            System.out.println("6. Thoát!");
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap vao lua chon tu 2-6: ");
                n = scanner.nextInt();
            }while(n<2 || n>5);
            switch (n){
                case 2:
                    System.out.println("Show list");
                    JdbcData jdbcData = new JdbcData();
                    ResultSet resultSet = jdbcData.getData();
                    //System.out.println(resultSet);
                    System.out.printf("%-10s%-20s%-20s%-10s\n","Id","Full Name","Username","Password");
                    if (resultSet.next()==true) {
                        while (resultSet.next()) {
                            int id2 = resultSet.getInt("id");
                            String username = resultSet.getString("username");
                            String password = resultSet.getString("password");
                            String fullName = resultSet.getString("fullName");
                            System.out.printf("%-10s%-20s%-20s%-10s\n", id2, fullName, username, password);
                        }
                    }else {
                        System.out.println("Khong co du lieu");
                    }
                    break;
                case 3:
                    System.out.println("Thêm nhân sự");
                    System.out.println("Nhap vao fullname: ");
                    Scanner scanner = new Scanner(System.in);
                    String a = scanner.nextLine();
                    System.out.println("Nhap vao usernamed: ");
                    scanner = new Scanner(System.in);
                    String b = scanner.nextLine();
                    System.out.println("Nhap vao password: ");
                    scanner = new Scanner(System.in);
                    String c = scanner.nextLine();
                    Connection connection = null;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/samsung","root","root");

                    Statement stmt = connection.createStatement();
                    String sql = "INSERT INTO account(fullName, username, password) VALUES ( '"+a+"', '"+b+"', '"+c+"')";
                    stmt.executeUpdate(sql);
                    System.out.println("Them nhan su thanh cong");

                    break;

                case 4:
                    System.out.println("Sửa nhân sự");
                    System.out.println("Nhap vao id nhan su can sua: ");
                    scanner = new Scanner(System.in);
                    String d = scanner.nextLine();
                    System.out.println("Nhap vao fullname can sua: ");
                    scanner = new Scanner(System.in);
                    String fn = scanner.nextLine();
                    System.out.println("Nhap vao username can sua: ");
                    scanner = new Scanner(System.in);
                    String un = scanner.nextLine();
                    System.out.println("Nhap vao password can sua: ");
                    scanner = new Scanner(System.in);
                    String pw = scanner.nextLine();

                    //Connection connection1 = null;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/samsung","root","root");


                    Statement stmt1 = connection.createStatement();
                    String sql1 = "UPDATE account SET fullName = '"+fn+"',username = '"+un+"',password = '"+pw+"' WHERE id='"+d+"'";
                    stmt1.executeUpdate(sql1);
                    System.out.println("Sua nhan vien thanh cong");

                    break;
                case 5:
                    System.out.println("Xoá nhân sự");
                    break;
                case 6:
                    System.out.println("Stop chuong trinh");
                    break;
            }
        }
    }
}
