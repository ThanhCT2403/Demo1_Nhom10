package com.tn;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> newStudent =  new ArrayList<>();

        newStudent.add("Thanh");
        newStudent.add("Trung");
        newStudent.add("Can");
        System.out.println(newStudent);
            //List<String> result = newStudent.stream().map(obj -> obj.toUpperCase()).collect(Collectors.toList());
            //List<String> result = newStudent.stream().map(String::toUpperCase()).collect(Collectors.toList());
        List<String> result = newStudent.stream()
                                            .map(obj -> {
                                        obj = obj.toUpperCase();
                                        obj = obj+"abc";
                                        return obj;
                                    }).collect(Collectors.toList());
        System.out.println(result);

    }
}
