package com.mang;

public class Mang {
    public int[] arr;

    public Mang(int[] arr){
        this.arr =arr;
    }

    public  void  printArrOnce(){
        System.out.println("\nCác phần tử xuất hiên trong mảng đúng 1 lần là : ");
        for (int i = 0; i <arr.length ; i++) {
            int temp=0;
            for (int j= 0; j <arr.length ; j++) {
                if(arr[i]==arr[j] && i!=j){

                    temp++;
                    break;
                }
            }
            if(temp==0){
                System.out.printf(" "+arr[i]);
            }


        }

        System.out.println();
    }

    public  void  printArrTwice(){
        System.out.println("\nCác phần tử xuất hiên trong mảng đúng 2 lần là : ");
        for (int i = 0; i <arr.length ; i++) {
            int temp=0;
            for (int j= 0; j <arr.length ; j++) {
                if(arr[i]==arr[j] && i!=j){

                    temp++;

                }
            }
            if(temp==1){
                System.out.printf(" "+arr[i]);
            }


        }
        System.out.println();
    }
}


