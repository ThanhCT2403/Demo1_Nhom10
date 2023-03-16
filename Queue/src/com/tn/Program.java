package com.tn;

import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        //Tao hang thanh toan sieu thi trc ra trc
        Queue<Integer> numbers = new LinkedList<>();
        //Chen phan tu chi dinh vao Queue bang phuong thuc offer
        numbers.offer(2);
        numbers.offer(1);
        numbers.offer(3);
        System.out.println("Queue: "+numbers);

        //Truy cap cac phan tu dau tien trong queue
        int accessedNumber = numbers.peek();
        System.out.println("Truy cap phan tu: "+accessedNumber);


        //Loai bo cac phan tu trong Queue phan tu 2, vi no vao trc
        int removedNumber = numbers.poll();
        System.out.println("Loai bo phan tu: "+removedNumber);

        //con[1, 3]
        System.out.println("Queue: "+numbers);

        removedNumber = numbers.poll();
        System.out.println("Loai bo phan tu:"+removedNumber);
        System.out.println("Queue: "+numbers);


    }
}
