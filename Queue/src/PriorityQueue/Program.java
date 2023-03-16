package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        //queue sap xep theo thu tu, vao trc ra trc
        Queue<Integer> numbers  = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        System.out.println("Danh sach ban dau");
        System.out.println("Data: "+numbers);

        for (Integer i:numbers){
            System.out.println(i+"\t");
        }
        //Lay ra phan tu dau tien va xoa phan tu do:
        System.out.println("\nPhan tu dau tien: "+numbers.poll());//Ham Poll = Remove
        System.out.println("Data: "+numbers);
        System.out.println("Phan tu dau tien: "+numbers.poll());

        numbers.offer(1);
        System.out.println("\nPhan tu dau tien: "+numbers.poll());
        System.out.println("Data: "+numbers);
    }
}
