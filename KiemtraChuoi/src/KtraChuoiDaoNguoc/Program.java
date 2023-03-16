package KtraChuoiDaoNguoc;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi n: ");
        String str1 = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi m: ");
        String str2 = scanner.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("2 chuoi khong phai dao nguoc");
        } else {
            boolean result = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(str2.length()) - 1 - i) {
                    result = false;
                    break;
                }
            }
            if (result == true) {
                System.out.println("La dao nguoc");
            } else {
                System.out.println("Khong phai la dao nguoc");
            }
        }
    }

}
