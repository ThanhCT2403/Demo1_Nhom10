package com.tn;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Set<Integer> setNumber = new HashSet<>();
        setNumber.add(20);
        setNumber.add(21);
        setNumber.add(22);
        setNumber.add(21);
        setNumber.add(23);
        System.out.println("Size: " + setNumber.size());

        //Ko muon lay gia tri trung lap thi su dung SET
        for(Integer obj :setNumber){
            System.out.println("Element " + obj);
        }

        System.out.println("In bang Iterator ==");
        Iterator<Integer> iterator = setNumber.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println("Element la: " + iterator.next());
        }
    }
}
