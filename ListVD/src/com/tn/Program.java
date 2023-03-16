package com.tn;
import java.lang.annotation.ElementType;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        List<Person> listNew = new ArrayList<>();
        Person p1 = new Person(1,"Can","19TQB");
        Person p2 = new Person(2,"Trung","18HBT");
        Person p3 = new Person(3,"Thanh","20TP");
        listNew.add(p1);
        listNew.add(p2);
        listNew.add(p3);

        System.out.println("In bang Iterator ==");
        Iterator<Person> iterator = listNew.iterator();

        while (iterator.hasNext()){
            System.out.println("Element la: " + iterator.next());
        }

//        for (int i =0;i<listNew.size();i++){
//            System.out.println("Element " + listNew.get(i));
//        }

    }
}
