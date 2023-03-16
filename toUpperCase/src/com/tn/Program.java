package com.tn;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> listFullName = Arrays.asList("Nguyen Ngoc","Nguyen Nam");
        for (int i =0; i<listFullName.size();i++){
            String tmp = listFullName.get(i);
            tmp = tmp.toUpperCase();
            listFullName.set(i,tmp);

        }
        System.out.println(listFullName);
    }
}
