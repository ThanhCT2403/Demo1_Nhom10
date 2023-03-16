package com.tn;

public class Calculation {
    public static void main(String[] args) {
        int total = new Calculation().sum(5,6);

    }
    public Integer sum(Integer num1,Integer num2){
        if(num1 <0||num2<0){
            return null;
        } else if (num1 ==null||num2==null) {
            return 0;
        }
        return num1+num2;
    }
    public String fullName(String a,String b){
        return a+b;
    }
}
