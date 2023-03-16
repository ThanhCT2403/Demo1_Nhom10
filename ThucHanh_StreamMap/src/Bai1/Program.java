package Bai1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,18,8,25,19,39,102);
        System.out.println(list);
        List<Integer> result = list.stream()
                .map(obj -> {
                    obj = obj*2;
                    return obj;
                }).collect(Collectors.toList());
        System.out.println(result);
    }
}
