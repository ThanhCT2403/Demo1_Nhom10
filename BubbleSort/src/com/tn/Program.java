package com.tn;

public class Program {
    public static void main(String[] args) {
        int[] arrNum = new int[5];
        arrNum[0] = 5;
        arrNum[1] = 1;
        arrNum[2] = 4;
        arrNum[3] = 2;
        arrNum[4] = 8;
//        for (int i =0; i< arrNum.length;i++){
//            System.out.println(arrNum[i]);
//        }
        for (int i=0;i<arrNum.length;i++){
            for (int j=i+1;j<arrNum.length;j++){
                if (arrNum[i] > arrNum[j]){
                    int tmp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j]=tmp;
                }
            }
        }
        for (int i=0;i<arrNum.length;i++){
            System.out.println(arrNum[i]);
        }
    }
}
