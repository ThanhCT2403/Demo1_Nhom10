package com.tb;

public class Tong {
    int tong = 0;
    public int Tong(){
        for (int i=1;i<=100;i++){
            if(i%7==0){
                tong+=i;
            }
        }
        return tong;
    }
}
