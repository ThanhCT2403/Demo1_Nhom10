package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi n: ");
        String n = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi m: ");
        String m = scanner.nextLine();
        StringFunction Congchuoi = (s) -> s +" "+m;
        printFormatted(n,Congchuoi);

        StringFunction2 Ktrachuoi = (s) ->{
            s=false;
            if(n.contains(m)){
                s=true;

            }
            return s;
        };
        kiemthu(false,Ktrachuoi);

        Demchuoi demchuoi = (s) ->{
            s=n;
            int k = s.length();
            return k;

        };
        rsDemchuoi(n,demchuoi);

        Catchuoi catchuoi = (s) ->{
           String[] kq = s.split("\\s");
           return kq;
        };
        HamCatChuoi(n,catchuoi);

        Sosanhchuoi sosanhchuoi = (s) ->{
            s=false;
            if(n.length()>m.length()){
                s=true;

            }
            return s;
        };
        sosanhchuoi(true,sosanhchuoi);
    }




    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);

    }

    public static void kiemthu(boolean n, StringFunction2 format){
        Boolean result = format.run(n);
        System.out.println(result);
    }
    public static void rsDemchuoi(String n, Demchuoi format){
        int result = format.run(n);
        System.out.println(result);
    }
    public static void HamCatChuoi(String n, Catchuoi format){
        String[] result = format.run(n);
        for(String w:result){
            System.out.println(w);
        }
    }
    public static void sosanhchuoi(boolean n, Sosanhchuoi format){
        boolean result = format.run(n);
        if(result==true){
            System.out.println("Chuỗi thứ nhất dài hơn chuỗi thứ 2");
        }else {
            System.out.println("Chuỗi thứ 2 dài hơn chuỗi thứ 1");
        }
    }
}
