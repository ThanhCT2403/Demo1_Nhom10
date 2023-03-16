package com.tn;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(11);
        listNumber.add(12);
        listNumber.add(13);

        listNumber.add(20);
        listNumber.add(21);
        listNumber.add(22);

        listNumber.add(30);
        listNumber.add(31);
        listNumber.add(31);
        //In ra gia tri <20 hoac>29
        for (int i = 0; i<listNumber.size();i++){
            if (listNumber.get(i)<20 || listNumber.get(i)>29){
                System.out.println(listNumber.get(i));
            }
        }
        listNumber.clear();
    }
}
