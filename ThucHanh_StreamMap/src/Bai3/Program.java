package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> newPerson = Arrays.asList(
                new Person(1,"t1",850),
                new Person(2,"t2",1100)
        );




//        System.out.println(newPerson);
//        for (int i=0;i<newPerson.size();i++){
//            Integer n = newPerson.get(i).getSalary();
//            if (n<1000){
//                n =n*2;
//                newPerson.get(i).setSalary(n);
//            }
//            else {
//                n = n+200;
//                newPerson.get(i).setSalary(n);
//            }
//
//        }
//        System.out.println(newPerson);

        List<Person> result = newPerson.stream()
                .map(obj ->{
                    int salary = obj.getSalary();
                    if (salary<1000){
                        salary = salary*2;
                    }else {
                        salary = salary+200;
                    }
                    obj.setSalary(salary);
                    return obj;

                        }).collect(Collectors.toList());
        System.out.println(result);
    }
}
