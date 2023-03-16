package com.tn;

public class KtraChuoi {
    public boolean Chuoi(String n, String m){
        boolean kq = false;
        StringBuilder str = new StringBuilder(n);
        //n = str.reverse().toString();
        if (str.reverse().toString().equals(m)){
            kq=true;
        }
        return kq;
    }
}
