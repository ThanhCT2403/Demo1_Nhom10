package SortObjects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        List<Person> listPerson =Arrays.asList(
                new Person(1,"t1","123","Oliver",20),
                new Person(2,"t2","123","Jake",16),
                new Person(3,"t3","123","Noah",21)
        );
        //Collections.sort(listPerson, (obj1, obj2) ->obj1.getAge().compareTo(obj2.getAge()));
        //Ham compareTo chi lam viec voi doi tuong



//        Collections.sort(listPerson, (obj1, obj2) ->{
//            if(obj1.getAge()>obj2.getAge()){
//                return 1;
//            }else {
//                return -1;
//            }
//        });

        Collections.sort(listPerson, (obj1, obj2) ->{
            if(obj1.getAge()>obj2.getAge()){
                return 1;
            } else if (obj1.getAge()==obj2.getAge()) {
                return obj1.getFullName().compareTo(obj2.getFullName());
            } else {
                return -1;
            }
        });

        System.out.println(listPerson);


    }
}
