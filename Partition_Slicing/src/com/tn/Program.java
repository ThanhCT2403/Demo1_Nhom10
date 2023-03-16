package com.tn;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(1, 3, 2, 4, 6);
        List<List<Integer>> lists = Lists.partition(listNumber,2);
        System.out.println("Result: "+lists);
    }
}
