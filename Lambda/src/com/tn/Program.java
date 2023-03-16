package com.tn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John",40000);
        salaries.put("Freddy",30000);
        salaries.put("Samuel",50000);

        salaries.replaceAll((name,oldValue) -> name.equals("Freddy") ? oldValue : oldValue +10000);

        List<String> names = Arrays.asList("John","Freddy","Samuel");
        names.forEach(name -> System.out.println("Hello, "+name));
//        System.out.println(names);
//        for (String obj:names){
//            System.out.println(obj);
//        }


        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);
        ages.forEach((name, age)-> System.out.println(name + " is " + age + " years old"));

        List<String> name1 = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
        List<String> namesWithA = name1.stream() .filter(name ->name.startsWith("A")) .collect (Collectors.toList());
        System.out.println(namesWithA);

        List<String> name2 = Arrays.asList("bob", "josh", "megan");
        name2.replaceAll(name -> name.toUpperCase());
        System.out.println(name2);

        List<Person> people = Arrays.asList(
                new Person(1,"t1",1000),
                new Person(2,"t2",1000)
        );
        people.forEach(obj->{
            obj.salary = 2000;
            System.out.println(obj);
        });
    }

}
