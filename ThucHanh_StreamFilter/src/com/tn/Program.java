package com.tn;

import javax.lang.model.type.NullType;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> listFullname = Arrays.asList(
                new Person(1,"t1","123","Hanh",17),
                new Person(5,"t2","123","Chi",28),
                new Person(4,"t3","123","Tran",20)
        );
        List<Person> result = listFullname.stream()
                .filter(obj -> {
                        if (obj.getId()>3) {
                            return true;
                        }
                        else {
                            return false;
                        }
                })
                .collect(Collectors.toList());
        System.out.println(result);

        List<Person> result2 = listFullname.stream()
                .filter(obj -> {
                    String personName = obj.getFullName();
                    boolean a= false;
                    if (personName.contains("H") ||personName.contains("h")){
                        a = true;
                        return a;
                    }else{
                        return a;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(result2);

        List<Person> result3 = listFullname.stream()
                .filter(obj -> {
                    if(obj.getPassword().isEmpty()||obj.getAge()<18) {
                        return true;
                    }
                    else {
                        return false;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(result3);
    }
}
