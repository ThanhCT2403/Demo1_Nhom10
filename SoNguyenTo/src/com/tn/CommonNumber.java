package com.tn;

public class CommonNumber {
    public boolean isPrime(int n) {
        boolean kq = true;
        for (int i = 2;i<=n/2;i++){
            if (n % i ==0){
                kq = false;
                //return kq;
            }
        }
        return  kq;
    }
}
