package com.tn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> listFullname = Arrays.asList("Oliver","Jake","Noah","James","James","Jack");
        List<String > result = listFullname.stream()
                            .filter(obj -> {
                                boolean a = obj.equals("James");
                                return a;
                            })
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
