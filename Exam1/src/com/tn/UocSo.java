package com.tn;

public class UocSo {
    int a;
    public UocSo(){

    }
    public int Tich(){
        int tich = 1;
        for(int i=1;i<=a;i++){
            if (a%i == 0){
                tich *=i;
                return tich;
            }
        }
        return tich;
    }
    public int Tong(){
        int tong = 0;
        for(int i=1;i<=a;i++){
            if (a%i == 0){
                tong +=i;
                return tong;
            }
        }
        return tong;
    }

}
