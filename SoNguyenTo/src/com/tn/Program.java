package com.tn;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n;
        do {
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
        }while(n <= 0);
        if (n==1){
            System.out.println("So 1 khong la So nguyen to");
        }
        else if (n == 2) {
            System.out.println("So 2 la So nguyen to");
        }
        else {
            CommonNumber cN = new CommonNumber();
            boolean kq = cN.isPrime(n);
            if (kq == true){
                System.out.println("la so nguyen to");
            }
            else{
                System.out.println("Khong la so nguyen to");
            }
        }
    }
}
