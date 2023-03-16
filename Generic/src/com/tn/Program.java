package com.tn;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //<>chi khai bao kieu doi tuong
//        Gen<Integer> gen = new Gen(10);
//        gen.showData();
//
//        Gen<String> gen1 = new Gen("Ngoc");
//        gen1.showData();

        Person person = new Person(1,"t1","123");
        Gen<Person> gen2 = new Gen<>(person);
        gen2.showData();

        Person person2 = new Person(2,"t2","123");
        Person person3 = new Person(3,"t3","123");

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person2);
        listPerson.add(person3);
        System.out.println(listPerson.size());

        Gen<List<Person>> gen14 = new Gen<>(listPerson);
        gen14.showData();



    }
}
