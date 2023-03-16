package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> newPerson =  new ArrayList<>();
        Person p1 = new Person("Ngoc",30,"17 Pham Hung");
        Person p2 = new Person("Jack",27,"21 Le Thanh Nghi");
        Person p3 = new Person("Lawrence",33,"3 Tam Trinh");

        newPerson.add(p1);
        newPerson.add(p2);
        newPerson.add(p3);

        System.out.println(newPerson);

        List<String> result = newPerson.stream()
                .map(obj -> {
                   String t1 = obj.getName();
                    return t1;
                }).collect(Collectors.toList());
        System.out.println(result);
        }
}
