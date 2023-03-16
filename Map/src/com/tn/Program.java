package com.tn;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Integer, String> mapPeople = new HashMap<>();
        mapPeople.put(1,"Ngoc");
        mapPeople.put(2,"Nam");

        System.out.println(mapPeople);
        for (Map.Entry<Integer, String> entry : mapPeople.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer, Person> mapPeople2 = new HashMap<>();
        Person person1 = new Person(1,"Ngoc","123@gmail.com");
        Person person2 = new Person(21,"Nam","321@gmail.com");

        mapPeople2.put(10, person1);
        mapPeople2.put(20, person2);
        for (Map.Entry<Integer, Person> entry : mapPeople2.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
